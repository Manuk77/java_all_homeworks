package org.all_homeworks.collections_and_generics.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueue<E> {
    PriorityQueue<E> queue;

    public CustomPriorityQueue() {

        queue = new PriorityQueue<>();
    }
    public CustomPriorityQueue(PriorityQueue<E> queue) {
        this.queue = queue;
    }

    public PriorityQueue<E> getQueue() {
        return queue;
    }


    public void add(E element) {

        queue.add(element);

    }

    public void remove() {
        queue.remove();
    }

    public void removeAll() {
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }



    public void maxPriority() {
        queue = new PriorityQueue(Comparator.reverseOrder());
    }

    public void copy(PriorityQueue<E> que) {
        que.addAll(queue);
    }

    public void print() {
        if(!queue.isEmpty()) {
            for (E e: queue) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        return;
    }

}
