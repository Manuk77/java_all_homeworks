package org.all_homeworks.collections_and_generics.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class CollectionsHome<T> {

    Stack<Integer> st = new Stack<>();
    // 1. iterates of all elements in the ArrayList
    public void iterateAll(ArrayList<Integer> e){
        for(Integer x: e){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // 2. inserts to the firs position in arrayList
    public void insertFirst(ArrayList<Integer> e, Integer elem) {
        e.add(0, elem);
        iterateAll(e);
    }

    // 3. update specified element
    public void update(Integer e, ArrayList<Integer> elems) {
        elems.set(0, 7);
    }

    // 4. searches specified element in arrayList
    public boolean search(Integer e, ArrayList<Integer> elems) {
        return elems.contains(e);
    }

    // 5. copies arrayList into second arrayList
    public boolean copy(ArrayList<Object> e, ArrayList<Object> elems) {
        e.add(0, elems.clone());
        return true;
    }

    // 6. revers arrayList elements

    public void revers(ArrayList<Integer> e) {
        ArrayList<Integer> es = new ArrayList<>();
        for (int i = 0; i < e.size(); ++i) {
            es.add(e.get(e.size() - i - 1));
        }
        iterateAll(es);
    }

    // 7. swap two element in arrayList
    public void swap(ArrayList<Integer> e, int index1, int index2) {
        if(checkIndex(index1, e) && checkIndex(index2, e)){
            Integer temp = e.get(index1);
            e.set(index1, e.get(index2));
            e.set(index2, temp);
            return;
        }
        System.out.println("invalid index ");
    }
    public boolean checkIndex(int index, ArrayList<Integer> e) {
        if(index < 0 || index >= e.size()){
            return false;
        }
        return true;
    }

    // 8. tests is empty or not specified arrayList\
    public boolean isEmptyOr(ArrayList<Integer> e) {
        return e.size() == 0;
    }

    // 9. increase arrayList size(or capacity)
    public void increaseSize(ArrayList<Integer> e) {
        ArrayList<Integer> newL= new ArrayList<>(e.size() << 1);
        e = newL;
        System.out.println("the size has increased two times");
    }

    // 10. iterate to all elements in linkedList
    public void iterateAll(LinkedList<Integer> e) {
        for(Integer x: e) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 11. iterate reverse in linkedList
    public void reverseLinked(LinkedList<Integer> e) {
        for (int i = e.size() - 1; i >= 0; --i) {
            System.out.print(e.get(i) + " ");
        }
        System.out.println();
    }
    // 12. insert at first and last position
    public void insertFirstLast(Integer e, LinkedList<Integer> es, int firsOrLast) {
        if(firsOrLast < 0) {
            es.add(e);
            iterateAll(es);
        }else {
            LinkedList<Integer> newTemp = new LinkedList<>();
            newTemp.add(e);
            for(int i = 1, j = 0; j < es.size(); ++i, ++j) {
                newTemp.add(i, es.get(j));
            }
            es = newTemp;
            iterateAll(es);
        }

    }
    // 13. insert at the end
    public void insertAtEnd(LinkedList<Integer> e, Integer elem) {
        e.add(elem);
        iterateAll(e);
    }

    // 14. remove firs and las element in linkedList
    public void removeFirstLast(LinkedList<Integer> e, int firstOrLast) {
        if (firstOrLast < 0) {
           e.remove(0);
           iterateAll(e);
        }else {
            e.remove(e.size() - 1);
            iterateAll(e);
        }
    }
    // 15. clone from one linkedList to another LinkedList
    public void cloneLinkedList(LinkedList<Integer> e) {
        LinkedList<Integer> es = new LinkedList<>();
        for (int i = 0; i < e.size(); ++i) {
            es.add(e.get(i));
        }
        iterateAll(e);
    }
    // 16. tests Linked list is empty
    public boolean isEmptyLinked(LinkedList<Integer> e) {
        return e.size() == 0;
    }
    // 17. reads from console and collects in ArrayList, stops collecting when entered is empty line ""
    public void consoleCol(ArrayList<Integer> e) {
        Scanner sc = new Scanner(System.in);
        Integer es = sc.nextInt();
        while (es != 0) {
            e.add(es);
            es = sc.nextInt();
        }
        int sum = sum(e);
        System.out.println("sum -> " + sum + " average -> " + sum / e.size());
    }
    // 17. subMethods
    public int sum(ArrayList<Integer> e) {
        int sum = 0;
        for (int i = 0; i < e.size(); ++i) {
            sum += e.get(i);
        }
        return sum;
    }

    // 17. subMethods
    public int iterateAllOf(ArrayList<Integer> e){
        for(Integer x: e){
            System.out.print(x + " ");
        }
        System.out.println();
        return 0;
    }

    // 18. reads from console and sorts increasing
    public void readSort(ArrayList<Integer> e) {
        Scanner sc = new Scanner(System.in);
        Integer es = sc.nextInt();
        while (es != 0) {
            e.add(es);
            es = sc.nextInt();
        }
        bubbleSort(e);
        iterateAll(e);
        return;

    }
    // 18. subMethod
    public void bubbleSort(ArrayList<Integer> e) {
        for(int i = 0; i < e.size() - 1; ++i) {
            boolean isSorted = true;
            for(int j = 0; j < e.size() - i - 1; ++j) {
                if(e.get(j) > e.get(j + 1)){
                    swap(e, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }

    }
    // 19. remove all negative numbers
    public void removeNegative(ArrayList<Integer> e) {
        ArrayList<Integer> es = new ArrayList<>(e.size());
        for (int i = 0; i < e.size(); ++i) {
            if(e.get(i) >= 0){
                es.add(e.get(i));
            }
        }
        e = es;
        iterateAll(e);
    }
    // 20. removes all odd numbers from the list
    public void removeOdd(ArrayList<Integer> e) {
        ArrayList<Integer> es = new ArrayList<>(e.size());
        for (int i = 0; i < e.size(); ++i) {
            if((e.get(i) & 1) == 1) {
                es.add(e.get(i));
            }
        }
        e = es;
        iterateAll(e);
    }
    // 21. write class called stack which collects elements as ArrayList
    //     which haz methods push(), pop(), isEmpty()

    class Stack<T> {
        ArrayList<T> e = new ArrayList<>();

        Stack() {}

        public boolean push(T e) {
            this.e.add(e);
            return true;
        }
        public boolean pop() {
            System.out.println(e.get(e.size() - 1));
            e.remove(e.size() - 1);
            return true;
        }

        public boolean isEmpty(){
            return e.size() == 0;
        }

        void print(){
            for(T x : e){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    // 22. replaces the first item with second item of type T if they occurrence in list

    public void replaceOneWith(ArrayList<T> e, T existedElem, T replacedElem) {
        for (int  i = 0; i < e.size(); ++i) {
            if (e.get(i) == existedElem) {
                e.set(i, replacedElem);
            }
        }
        iterateAllT(e);
    }
    public void iterateAllT(ArrayList<T> e){
        for(T x: e){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        ArrayList<Integer> e = new ArrayList<>();
        e.add(4);
        e.add(-3);
        e.add(11);
        e.add(-4);
        e.add(2);


        CollectionsHome esss = new CollectionsHome();
        ArrayList<Integer> eio = new ArrayList<>(15);

        esss.replaceOneWith(e, 11, 100);

//        LinkedList<Integer> es = new LinkedList<>();
//        es.add(5);
//        es.add(5);
//        es.add(4);
//        es.add(3);
//        es.add(1);
//        esss.iterateAll(es);
//        esss.reverseLinked(es);
//        esss.insertFirstLast(7, es, 0);
//        ArrayList<Integer> egd = new ArrayList<>(10);
//
//        esss.consoleCol(egd);

    }
}
