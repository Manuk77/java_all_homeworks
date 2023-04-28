package org.all_homeworks.collections_and_generics.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ListGeneric<Integer> list = new ListGeneric<>();
//        list.add(7);
//        list.add(8);
//        list.print();
//        System.out.println(list.get(1));
//
//        Generic l = new Generic();
//
//        List<Integer> li = new ArrayList<>();
//        li.add(4);
//        li.add(5);
//        li.add(12);
//        Generic.print(li);
//
//        System.out.println(l.maxElement(li));
//
//        // homework ex 5.
//
//        PairOFObjects<Integer, String> les = new PairOFObjects<>(5, "manuk");
//        System.out.println(les.toString());
//
//        // homework ex 6.
//
//        Library<String> library = new Library<>();
//        library.addMedia("Good Will Hunting");
//        library.addMedia("Forest Gump");
//        library.addMedia("koms monte cristo");
//        library.print();
//
//        // homework 7.

        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int count = SpecificCollectionProperty.countElements(arr, new OddInteger());
        System.out.println("count of odd integers -> " + count);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(13);
        arr2.add(17);
        arr2.add(10);

        int count1 = SpecificCollectionProperty.countElements(arr2, new PrimeNumbers());
        System.out.println("prime number count -> " + count1);

        List<String> str = new ArrayList<>();
        str.add("anssna");
        str.add("ssaass");
        str.add("arrrra");
        str.add("capasity");
        int count2 = SpecificCollectionProperty.countElements(str, new Palindrome());
        System.out.println("count of palindromes -> " +  count2);







    }
}
