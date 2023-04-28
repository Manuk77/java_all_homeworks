package org.all_homeworks.collections_and_generics.collection.custom_lists;

public class CustomLinkedList<E> {
    private int size;
    private int modCount;
    private Node<E> first;
    private Node<E> last;

    public CustomLinkedList() {}

    public CustomLinkedList(E first) {
        add(first);
    }

    /**
     * this method returns modification count of LinkedList
     * @return modeCount
     */
    public int getModCount() {
        return modCount;
    }
    /**
     * this method checks legality of the given index
     * @param index which has to be checked for validity
     * @return true if it's valid index, and false if it's not
     * @throws IllegalArgumentException if the given index is out of range throws IllegalArgumentException
     */
    private boolean checkIndex(int index) throws IllegalArgumentException{
        if (index < 0 || index >= size) {
           try {
               throw new IllegalArgumentException("Illegal Argument " + index);
           }catch (IllegalArgumentException e){
               System.out.println(e.getMessage());
           }finally {
               return false;
           }
        }
        return true;
    }

    /**
     * this method adds an element from last position
     * @param e is new element which need to be added
     * @return true if it's successfully added
     */
    public boolean add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        }else {
            l.next = newNode;
        }
        size++;
        modCount++;
        return true;
    }

    /**
     * inserts element from front
     * @param e element of type E which has to be inserted
     * @return true
     */
    private boolean insertFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null) {
           last = newNode;
        }else{
            f.prev = newNode;
        }
        size++;
        modCount++;
        return true;
    }

    /**
     * this method calls add() method for adding each element to the list
     * @param e type of E vararg
     */
    public void addAll(E ... e) {
        Node<E> x = first;
        for( ;x != null;){
            Node<E> next = x.next;
            x = next;
        }
        for(int i = 0; i < e.length; ++i) {
            add(e[i]);
        }
    }

    /**
     * this method returns index of the element if it's exist
     * if it's not returns -1
     * @param e element type of E which is going to search
     * @return returns index if it's exist, else returns -1
     */
    public int indexOf(E e) {
       return indexOfElement(e);
    }
    private int indexOfElement(E e) {
        Node<E> x = first;
        int count = 0;
        for (; x != null;) {
            if(e == x.item){
                return count;
            }
            Node<E> next = x.next;
            x = next;
            count++;
        }

       return count = -1;
    }

    /**
     * this method checks contains the list given element
     * @param e type of E
     * @return true if the given element exist, and false if it's not
     */
    public boolean contains(E e) {
        if(indexOfElement(e) != -1) {
            return true;
        }
        return false;
    }

    /**
     * this method returns element with index if the given index is legal
     * this method calls getWithIndex() method for getting the item
     * @param index returned element index if it's legal
     * @return element with given index
     */
    public E get(int index) {
        if (checkIndex(index)) {
            E e = getWithIndex(index);
            return e;
        }
        return null;
    }

    private E getWithIndex(int index) {
        int count = 0;
        Node<E> x = first;
        for (; x != null;) {
            if (count == index) {
                return x.item;
            }else {
                Node<E> next = x.next;
                x = next;
                count++;
            }
        }
        return null;
    }

    /**
     * this method clears all elements in the list
     */
    public void clear() {
        first = last = null;
        size = 0;
        modCount++;
        System.out.println("the list has cleared :)");
    }

    /**
     * replaces the given element in the given index, if the given index is valid
     * this method calls change() method for replacing the element
     * @param index specified index of replacement
     * @param element specified element which is going to be replaced
     * @return tue if it's replaced successfully, and false if it's not
     */
    public boolean replace(int index, E element) {
        boolean isReplaced = false;
        if (checkIndex(index)) {
            return change(index, element);
        }
        return isReplaced;
    }

    private boolean change(int index, E element) {
        int count = 0;
        Node<E> x = first;
        for (; x != null;) {
            if (count == index) {
               x.item = element;
               modCount++;
               return true;
            }else {
                count++;
                Node<E> next = x.next;
                x = next;
            }
        }
        return false;
    }

    /**
     * removes element with given index if it's valid index
     * and calls checkIndex() method for checking index validity if it's returns true
     * it calls delete method for remove element with specified index
     * @param index specified index of removed element
     * @return true if specified index is valid, and false if it's not
     */
    public boolean remove(int index) {
        if (checkIndex(index)) {
            return delete(index);
        }
        return false;
    }

    /**
     * this method deletes element with given index, if the given index is 0
     * it calls deleteFirst() method, if it's equal size - 1, it calls deleteLast() method
     * and if it's range (0, size - 1) it deletes it on his own :)
     * @param index index of removing element
     * @return ture
     */
    private boolean delete(int index) {

        if(index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        int count = 1;
        Node<E> x = first.next;
        for (; x != null;) {
            if (count == index) {
                x.prev.next = x.next;
                x.next.prev = x.prev;
                modCount++;
                size--;
                return true;
            }else {
                Node<E> next = x.next;
                x = next;
                count++;
            }
        }
        return false;
    }

    /**
     * this method deletes firstElement
     * @return ture
     */
    private boolean deleteFirst() {
        Node<E> x = first.next;
        first = x;
        modCount++;
        size--;
        return true;
    }

    /**
     * this method deletes lastElement
     * @return true
     */
    private boolean deleteLast() {
        Node<E> x = last.prev;
        x.next = null;
        last = x;
        modCount++;
        size--;
        return true;
    }

    /**
     * this method inserts the given element in specified index
     * @param index specified index where is going to element be inserted
     * @param e specified element which is going to be inserted in specified index
     * @return true if the specified index is valid, and false if it's not
     */
    public boolean insert(int index, E e) {
        if (checkIndex(index)) {
            if (index == size) {
                return add(e);
            }
            if (index == 0) {
               return insertFirst(e);
            }
            return insertBetween(index, e);
        }
        return false;
    }

    private boolean insertBetween(int index, E e) {
        int count = 1;
        Node<E> x = first.next;
        for (; x != null;) {
            if (count == index) {
                Node<E> newNode = new Node<>(x.prev, e, x);
                x.prev.next = newNode;
                x.prev = newNode;
                modCount++;
                size++;
            }
            Node<E> next = x.next;
            x = next;
            count++;
        }
        return true;
    }





    /**
     *
     * @return size of LinkedList
     */
    public int getSize() {
        return this.size;
    }

    /**
     * this method checks is empty the list or not
     * @return true if list is empty, and false if it's not
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // prints the current linkedList
    public void print() {
        for(Node<E> x = first; x != null;) {
            Node<E> next = x.next;
            System.out.print(x.item + " ");

            x = next;
        }
        System.out.println();
    }


    /**
     * class Node which contains item of type E and Node type next, prev
     * @param <E> Generic type of elements
     */

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

    }
}
