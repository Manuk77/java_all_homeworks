package org.all_homeworks.collections_and_generics.generics;

public class ListGeneric<T> {
    private int size;
    private int modCount;
    private Object[] elements;
    private final int  DEFAULT_CAPACITY = 10;

    public ListGeneric() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * this method creates new array with 2 times greater than old array if it's possible
     * ande copies the old arrays elements to the new one
     * @param newCapacity of new arraylist
     */
    private void copyArray(int newCapacity) {

        Object[] tempArr = elements;
        elements = new Object[newCapacity];
        for(int i = 0; i < tempArr.length; ++i){
            elements[i] = tempArr[i];
        }

    }

    /**
     * this method returns modification count of array
     * @return modCount
     */
    public int getModCount() {
        return modCount;
    }

    /**
     * this method increases the capacity if it's not more than Integer.Max_Value - 8
     * in side od this method it calls the copyArray() method to copy all elements of old array to the
     * new array
     * @return ture if the new capacity is less than Integer.MAX_VALUE - 8, and false if it's not
     */
    private boolean increaseCapacity() {
        final int newCapacity = this.DEFAULT_CAPACITY << 1;
        if((newCapacity < Integer.MAX_VALUE - 8)){
            copyArray(newCapacity);
            return true;
        }
        return false;
    }

    /**
     * this method adds the given element to the current arr if it's size is less than it's capacity
     * @param element element whose presence in this collection is to be ensured
     * @return true if the given element was added
     */

    public boolean add(T element) {

        if (this.size < this.elements.length) {
            this.elements[size++] = element;
            modCount++;
            return true;
        }
        if (increaseCapacity()) {
            this.elements[size++] = element;
            modCount++;
            return true;
        }

        return false;

    }

    /**
     * this method calls checkIndex() method for checking validity of specified index
     * then calls insertIn() method for inserting specified element
     * @param index specified index of element where is going to be element inserted
     * @param e element type of Integer
     * @return true if specified index is valid, and false if it's not
     */
    public boolean insert(int index, T e) {
        if (checkIndex(index)) {
            return insertIn(index, e);
        }
        return false;
    }

    /**
     * this method chooses the method which has to be callean, if index is equal to 0, it calls insertFront() method
     * if index is equal to size - 1, it calls add() method and if it's in (0, size - 1) range it calls
     * insertBetween() method
     * @param index specified index of inserting element
     * @param e specified element which is going to be inserted in specified index
     * @return ture if specified index is valid, false if it's not
     */
    public boolean insertIn(int index, T e) {
        Object[] newObj = new Object[elements.length];
        if (size < elements.length) {
            if (index  == 0) {
                insertFront(newObj, e);
                return true;
            }
            if (index == size - 1) {
                return add(e);
            }
            return insertBetween(newObj, index, e);
        }else {
            if(increaseCapacity()){
                if (index  == 0) {
                    insertFront(newObj, e);
                    return true;
                }
                if (index == size - 1) {
                    return add(e);
                }
                return insertBetween(newObj, index, e);
            }
        }
        return false;
    }

    /**
     * this method inserts the specified element in front of array
     * @param o is array of type Object
     * @param e specified element which is going to be inserted
     */
    private void insertFront(Object[] o, T e) {
        o[0] = e;
        for (int i = 1, j = 0; j < size; ++i, ++j) {
            o[i] = elements[j];
        }
        elements = o;
        size++;
        modCount++;

    }

    /**
     * this method inserts specified element in specified index of array
     * @param newObj array of Object type
     * @param index specified index, where is going to be inserted specified element
     * @param e specified element which is going to be inserted
     * @return true after inserting is done
     */
    private boolean insertBetween(Object[] newObj, int index, T e) {

        for (int i = 0; i < index; ++i) {
            newObj[i] = elements[i];
        }
        newObj[index] = e;
        for(int k = index, j = k + 1; k < size; ++k, ++j) {
            newObj[j] = elements[k];
        }
        size++;
        modCount++;
        elements = newObj;
        return true;
    }

    /**
     * this method adds elements list
     * @param elements array of type Integer
     */
    private void adds(T[] elements) {
        for (int  j = 0; j <  elements.length; ++j) {
            this.elements[size++] = elements[j];
        }
    }

    /**
     * this method adds all element if it has space for that match elements
     * @param elements elements array of type object
     * @return ture if it's added and false when there was not:
     */
    public boolean addAll(T[] elements) {

        boolean isAdded = false;
        if(this.elements.length - this.size < elements.length) {
            do{
                isAdded = increaseCapacity();

            }while (this.elements.length - this.size < elements.length && isAdded);

        }
        adds(elements);
        modCount++;

        return isAdded;
    }

    /**
     * this method checks legality of the given index
     * @param index which has to be checked for validity
     * @return true if it's valid index, and false if it's not
     * @throws IllegalArgumentException if the given index is out of range throws IllegalArgumentException
     */
    private boolean checkIndex(int index) throws IllegalArgumentException{
        if(index < 0 || index >= size){
            try {
                throw  new IllegalArgumentException("Illegal Argument  " + index);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());

            }finally {
                return false;
            }
        }
        return true;
    }



    /**
     * this method removes element with index if it's legal
     * this method calls checkIndex() method for checking the given
     * index is legal or not
     * @param index index of element which has to be removed
     * @return tue if it's legal index and returns true, and false if it's not legal index
     */
    public boolean remove(int index) {
        final Object[] es = elements;
        final int size = this.size;
        if(checkIndex(index)){
            removeElem(index);
            return true;
        }
        return false;
    }

    /**
     * this method removes element in specified index
     * @param index specified index of element
     */
    private void removeElem(int index) {
        if (index == 0) {
            for (int i = 1; i < size; ++i) {
                elements[i - 0] = elements[i];
            }
            size--;
            modCount++;
        } else if (index == size - 1) {
            elements[size - 1] = null;
            size--;
            modCount++;
        }else {
            for (int i = index + 1; i < size; ++i) {
                elements[i - 1] = elements[i];
            }
            size--;
            modCount++;
        }
    }

    /**
     * this method copies the array's element to the new one
     * except the element which we want to be removed
     * @param es array of type object
     * @param removedElemIndex elements index which has to be removed
     * @return es new array of type object
     */
    private Object[] arrCopy(Object[] es, int removedElemIndex) {
        for(int i = removedElemIndex; i < es.length - 1; ++i){
            swap(es, i, i + 1);
        }
        es[es.length - 1] = null;
        return es;
    }

    /**
     * this method changes two elements places
     * @param es is an array of type object
     * @param index1 first element
     * @param index2 second element
     */
    private void swap(Object[] es, int index1, int index2){
        Object temp = es[index1];
        es[index1] = es[index2];
        es[index2] = temp;
    }

    /**
     * this method returns true if our array is empty
     * and false if it's not
     * @return
     */
    public boolean isEmpty() {return size == 0;}

    /**
     * this method clears all elements from the array
     */
    public void clear() {
        modCount++;
        for(int to = size, i = size = 0;  i < to; ++i) {
            elements[i] = null;
        }
    }

    /**
     * Returns {@code true} if this list contains the specified element.
     * More formally, returns {@code true} if and only if this list contains
     * at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    public boolean contains (Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        return indexOfRange(o, 0, size);
    }
    private int indexOfRange(Object o, int start, int end) {
        Object[] es = elements;
        if (o == null) {
            for (int i = start; i < size; ++i) {
                if (es[i] == null) {
                    return i;
                }
            }
        }else {
            for (int i = start; i < size; ++i) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * returns element with given index, if it's in range of array.
     * returns -1 if's it's not in range:
     * @param index gets with index
     * @return element with specified index if exists and -1 if not
     */
    public Object get(int index) {
        if  (checkIndex(index)) {
            return elements[index];
        }
        return -1;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index index of the element to replace
     * @param element which has to be replaced with specified position
     * @return the previous element with specified position
     */
    public Object set(int index, Object element) {
        if (checkIndex(index)) {
            Object oldValue = elementData(index);
            elements[index] = element;
            return oldValue;
        }
        return -1;
    }

    // Positional Access Operation PIO
    private Object elementData(int index) {
        return elements[index];
    }

    /**
     * this method returns the size of array
     * @return size
     */
    public int size() {
        return this.size;
    }

    /**
     * replaces the given list of elements if the given indexes are valid
     * @param elements that are going to be replaced
     * @param startIndex index from where we are going to start replacing
     * @return true if the given indexes are valid and false if it's not
     */
    public boolean replace(int startIndex, T... elements) {
        boolean isReplaced = false;
        if (checkIndex(startIndex) && checkIndex(startIndex + elements.length)) {
            replaceOf(elements, startIndex);
            isReplaced = true;
        }
        return isReplaced;
    }

    // Replaces all elements that was given
    private void replaceOf(T[] elements, int startIndex) {
        for (int  j = 0; j < elements.length; ++j) {
            this.elements[startIndex++] = elements[j];
        }
    }





    /**
     * prints the elements list
     */
    public void print() {
        for (int i = 0; i < size; ++i) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
