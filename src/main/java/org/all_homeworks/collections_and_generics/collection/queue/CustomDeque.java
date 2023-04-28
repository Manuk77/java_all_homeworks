package org.all_homeworks.collections_and_generics.collection.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CustomDeque<E> {
    private LinkedList<E> list;
    private int sizeOfDeque;
    private int modeCount;
    private final int DEQUE_MAX_SIZE = 10;


    public CustomDeque() {
        list = new LinkedList<>();
    }
    public int getSizeOfDeque() {
        return sizeOfDeque;
    }

    public int getModeCount() {
        return modeCount;
    }

    /**
     * this method adds the element in first position
     * @param elem specified added element
     * @throws NullPointerException when given element is null
     * @throws IllegalArgumentException if some property of the specified element prevents it
     * from being added to this deque
     * @throws ClassCastException  if the class of the specified element prevents it from being added to this deque
     * @throws IllegalStateException if the element cannot be added at this time due to capacity restrictions
     */
    public void addFirst(E elem) throws NullPointerException, IllegalArgumentException, ClassCastException, IllegalStateException{
        if (isNotNull(elem)) {
            if (checkSizeOfDeque()) {
                list.addFirst(elem);
                sizeOfDeque++;
                modeCount++;
                return;
            }
            throw new IllegalStateException("the length of queue must be less than 11");
        }
        throw new NullPointerException("the given element must not be null");
    }

    /**
     * this method adds the element in last position
     * @param elem specified added element
     * @throws NullPointerException when given element is null
     * @throws IllegalArgumentException if some property of the specified element prevents it
     * from being added to this deque
     * @throws ClassCastException  if the class of the specified element prevents it from being added to this deque
     * @throws IllegalStateException if the element cannot be added at this time due to capacity restrictions
     */
    public void addLast(E elem) throws IllegalStateException, IllegalArgumentException, NullPointerException, ClassCastException{
        if (isNotNull(elem)) {
            if (checkSizeOfDeque()) {
                list.addLast(elem);
                sizeOfDeque++;
                modeCount++;
                return;
            }
            throw new IllegalStateException("deque is overflow");
        }
        throw new NullPointerException("the given element must not be null");
    }

    /**
     * this method adds element at first position if the deque size is less than DEQUE_MAX_SIZE
     * @param elem specified element for adding
     * @return true if size of deque is less than DEQUE_MAX_SIZE
     * @throws NullPointerException when specified element is null
     * @throws ClassCastException if the class of the specified element prevents it from being added to this deque
     * @throws IllegalArgumentException if some property of the specified element prevents it
     *                                   from being added to this deque
     */
    public boolean offerFirst(E elem) throws NullPointerException, ClassCastException, IllegalArgumentException{
        if (isNotNull(elem)) {
            if (checkSizeOfDeque()) {
                list.addFirst(elem);
                sizeOfDeque++;
                modeCount++;
                return true;
            }
            return false;
        }
        throw new NullPointerException("given element must not be null");
    }

    /**
     * this method adds element at last position if the deque size is less than DEQUE_MAX_SIZE
     * @param elem specified element for adding
     * @return true if size of deque is less than DEQUE_MAX_SIZE
     * @throws NullPointerException when specified element is null
     * @throws ClassCastException if the class of the specified element prevents it from being added to this deque
     * @throws IllegalArgumentException if some property of the specified element prevents it
     *                                   from being added to this deque
     */
    public boolean offerLast(E elem) throws NullPointerException, ClassCastException, IllegalArgumentException {
        if (isNotNull(elem)) {
            if (checkSizeOfDeque()) {
                list.addLast(elem);
                sizeOfDeque++;
                modeCount++;
                return true;
            }
            return false;
        }
        throw new NullPointerException("given element must not be null");
    }

    /**
     * this method removes firs element if list is not empty
     * @return E element when list is not empty
     * @throws NoSuchElementException when list is empty
     */
    public E removeFirst() throws NoSuchElementException{
        if (!list.isEmpty()) {
            sizeOfDeque--;
            modeCount++;
            return list.removeFirst();

        }
        throw new NoSuchElementException("list is empty");
    }
    /**
     * this method removes last element if list is not empty
     * @return E element when list is not empty
     * @throws NoSuchElementException when list is empty
     */
    public E removeLast() throws NoSuchElementException{
        if(!list.isEmpty()) {
            sizeOfDeque--;
            modeCount++;
            return removeLast();
        }
        throw new NoSuchElementException("list is empty");
    }

    /**
     * removes first when list is not empty
     * @return E element when list is not empty, else null
     */
    public E poolFirst() {
        if(!list.isEmpty()) {
            sizeOfDeque--;
            modeCount++;
            return list.removeFirst();
        }
        return null;
    }
    /**
     * removes last when list is not empty
     * @return E element when list is not empty, else null
     */
    public E poolLast() {
        if(!list.isEmpty()) {
            sizeOfDeque--;
            modeCount++;
            return list.removeLast();
        }
        return null;
    }

    /**
     * @return firs element if list is not empty
     * @throws NoSuchElementException when list is empty
     */
    public E getFirst() throws NoSuchElementException {
        if(!list.isEmpty()) {
            return list.getFirst();
        }
        throw new NoSuchElementException("list is empty");
    }
    /**
     * @return last element if list is not empty
     * @throws NoSuchElementException when list is empty
     */
    public E getLast() throws NoSuchElementException {
        if(!list.isEmpty()) {
            return list.getLast();
        }
        throw new NoSuchElementException("list is empty");
    }


    /**
     * @return firs element if list is not empty
     */
    public E peekFirst() {
        if(!list.isEmpty()) {
            return list.getFirst();
        }
        return null;
    }
    /**
     * @return last element if list is not empty
     */
    public E peekLast() throws NoSuchElementException {
        if(!list.isEmpty()) {
            return list.getLast();
        }
        return null;
    }

    /**
     * checks if the specified element exists in list
     * @param elem specified element for searching
     * @return true if specified element was founded, else false
     * @throws NoSuchElementException when list is empty
     */
    public boolean contains(E elem) throws NoSuchElementException {
        if (!list.isEmpty() && elem != null) {
            for (E e: list) {
                if (e.equals(elem))
                    return true;
            }
            return false;
        }
        throw new NoSuchElementException("list is empty");
    }



    /**
     * checks is the given element
     * @param elem specified element for checking
     * @return true if element is not null, else false
     */
    private boolean isNotNull(E elem) {
        if (elem != null)
            return true;
        return false;
    }

    /**
     * checks size of deque
     * @return true if sizeOfDeque is less than DEQUE_MAX_SIZE, else false:
     */
    private boolean checkSizeOfDeque() {
        return sizeOfDeque < DEQUE_MAX_SIZE ? true: false;
    }

    public void print() {
        if (!list.isEmpty()) {
            for (E e: list) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        return;
    }

}
