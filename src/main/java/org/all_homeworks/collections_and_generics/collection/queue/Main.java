package org.all_homeworks.collections_and_generics.collection.queue;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        CustomDeque<Integer> deque = new CustomDeque<>();
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.add(7);
        queue.add(9);
        queue.add(187);
        queue.add(-9);
        queue.print();

        deque.addFirst(5);
        deque.addLast(7);
        deque.addLast(74);
        deque.addFirst(89);
        deque.print();

        System.out.println(deque.poolFirst());
        System.out.println(deque.poolLast());
        deque.print();
        System.out.println(deque.getSizeOfDeque());
        System.out.println(deque.getModeCount());

        PriorityQueue<Integer> l = new PriorityQueue<>();
        l.add(7);
        l.add(45);

        PriorityQueue<String> s = new PriorityQueue<>();
        s.add("hello");
        s.add("fuck off");
        s.add("sorry for that:)");

        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(7);
        deq.add(8);

        PriorityQueue<CustomQueue> ls = new PriorityQueue<>();
        try{
            ls.add(queue);
        }catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(queue.contains(7));
        System.out.println(deque.contains(7));

//        if(queue.getSizeOfQueue() != 0) {
//            int n = queue.getSizeOfQueue();
//            for(int i = 0; i < n; ++i) {
//                System.out.print(queue.pop() + " ");
//            }
//            System.out.println();
//        }
//
//        if(deque.getSizeOfDeque() != 0) {
//            int n = deque.getSizeOfDeque();
//            for (int i = 0; i < n; ++i) {
//                System.out.print(deque.poolLast() + " ");
//
//            }
//            System.out.println();
//        }

        Queue<Integer> lsd = new LinkedList<>();
        for(int i = 0, j = 1; i < 51; ++i, j += 2) {
            lsd.add(j);
        }
        for(Integer i: lsd) {
            System.out.print(i + " ");
        }
        System.out.println();


        CustomPriorityQueue<Integer> lsi = new CustomPriorityQueue<>();
        lsi.add(5);
        lsi.add(2);
        lsi.add(3);
        lsi.add(4);
        lsi.print();
        lsi.maxPriority();
        lsi.add(5);
        lsi.add(2);
        lsi.add(3);
        lsi.add(4);
        lsi.print();


    }
}
