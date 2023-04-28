package org.all_homeworks.collections_and_generics.generics;

import java.util.List;

public class Generic {
    // homework ex 1.
    public <T> void change(T[] arr, int index1, int index2) {
       if (checkIndex(index1, arr) && checkIndex(index2, arr)) {
           if (index1 != index2) {
               T temp = arr[1];
               arr[1] = arr[2];
               arr[2] = temp;
           }
           throw new IllegalArgumentException("the given indexes has to be not equal");
       }
       throw new IndexOutOfBoundsException("the given indexes are out of bounds");

    }

    // homework ex 2.
    // the > operator can not apply to Generic types
//    final class Algorithm {
//        public  <T> T max(T x, T y) {
//            return x > y ? x : y;
//        }
//    }

    // homework ex 3.
    // this method will compile and run successfully
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
    // homework ex 4.
    public <E extends Comparable> E maxElement(List<E> list) {
        E max = list.get(0);
        for(int i = 1; i < list.size(); ++i) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }


    public<E> boolean checkIndex(int index, E[] arr) {
        if(index > 0 && index < arr.length)
            return true;
        return false;
    }
}
