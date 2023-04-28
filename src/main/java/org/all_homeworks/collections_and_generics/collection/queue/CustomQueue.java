package org.all_homeworks.collections_and_generics.collection.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;


public class CustomQueue<E> {

    private LinkedList<E> list;
    private int sizeOfQueue;
    private int modeCount;
    private final int QUEUE_MAX_LENGTH = 10;

    public CustomQueue() {
        this.list = new LinkedList<>();
    }



    /**
     * this method adds element at last position, if the given element is not null, adds and returns true
     * if it's not returns false
     * @param elem specified element to add
     * @return true if it's added this queue, else false
     * @throws IllegalStateException if the element cannot be added at this
     *        time due to capacity restrictions
     * @throws ClassCastException if the class of the specified element
     *              prevents it from being added to this queue
     * @throws NullPointerException if the specified element is null and
     *               this queue does not permit null elements
     *@throws IllegalArgumentException if some property of this element
     *              prevents it from being added to this queue
     */
    public boolean add(E elem) throws NullPointerException, ClassCastException, IllegalArgumentException, IllegalStateException {
        if (elem != null) {
            if ( sizeOfQueue < QUEUE_MAX_LENGTH) {
                list.addLast(elem);
                sizeOfQueue++;
                modeCount++;
                return true;
            }
            throw new IllegalStateException("max queue has to be less than 11");
        }
        throw new NullPointerException("the given element must not be null");
    }

    /**
     * this method removes first added element if queue is not empty:
     * @return first element if queue is not empty
     * @throws NoSuchElementException when this queue is empty
     */
    public E remove() throws NoSuchElementException {
        if (!list.isEmpty()) {
            sizeOfQueue--;
            modeCount++;
            return list.removeFirst();
        }
        throw new NoSuchElementException("No such element");
    }

    /**
     * this method returns firs element:
     * @return first element if the queue is not empty, else null
     */
    public E peek() {
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null;
    }

    /**
     * this method removes firs element of queue if it's not empty:
     * @return first element if queue is not empty, else null:
     */
    public E pop() {
        if(!list.isEmpty()) {
            sizeOfQueue--;
            modeCount++;
            return list.removeFirst();
        }
        return null;
    }

    /**
     * this method removes first element of queue if it's not empty
     * @return first element if queue is not empty
     * @throws NoSuchElementException if queue is empty
     */
    public E element() throws NoSuchElementException {
        if (!list.isEmpty()) {
            sizeOfQueue--;
            modeCount++;
            return list.removeFirst();
        }
        throw new NoSuchElementException();
    }
    /**
     * checks if the specified element exists in list
     * @param elem specified element for searching
     * @return true if specified element was founded, else false
     * @throws NoSuchElementException when list is empty
     */
    public boolean contains(E elem) throws NoSuchElementException {
        if(!list.isEmpty() && elem != null) {
            for (E e: list) {
                if (e.equals(elem))
                    return true;
            }
            return false;
        }
        throw new NoSuchElementException("list is empty");
    }

    /**
     * this method returns modification count of queue
     * @return modeCount
     */
    public int getModeCount() {
        return modeCount;
    }

    public int getSizeOfQueue() {
        return sizeOfQueue;
    }

    public void print() {
        if (!list.isEmpty()) {
            for(E s: list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
       return;
    }





}
