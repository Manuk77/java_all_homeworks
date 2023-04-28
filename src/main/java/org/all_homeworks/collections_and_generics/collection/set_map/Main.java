package org.all_homeworks.collections_and_generics.collection.set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import static org.collection_homework.collection.set_map.Human.compareWithAge;

public class Main {

    public static void main(String[] args) {

        UniqueWords words = new UniqueWords();
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("java");
        set.add("hello");
        set.add("good");
        set.add("java");
        set.add("hi");

        HashSet<Integer> int1 = new HashSet<>();
        HashSet<Integer> int2 = new HashSet<>();
        int1.add(7);
        int1.add(8);
        int1.add(9);
        int1.add(6);
        int1.add(4);
        int1.add(5);

        int2.add(7);
        int2.add(6);
        int2.add(4);
        int2.add(10);

        ExHashSet exHashSet = new ExHashSet();

        words.print(exHashSet.commonElementBetween(int1, int2));

        UniqueWords words1 = new UniqueWords();
        HashSet<String> str = new HashSet<>();
        str.add("areg");
        str.add("mane");
        str.add("arman");
        str.add("arman");
        str.add("areg");

        System.out.println("------------");
        words.print(words1.uniqueWordsIgnoreCase(str));

        HashSet<Human> sett = new HashSet<>();
        sett.add(new Human("Areg", 22));
        sett.add(new Human("Sergey", 24));
        sett.add(new Human("Vardan", 27));
        sett.add(new Human("Anahit", 19));
        sett.add(new Human("Ani", 24));

        ArrayList<Human> arrayList = new ArrayList<>(sett);
        Collections.sort(arrayList, compareWithAge);

        Human h = new Human();

        TreeSet<Human> humanTreeSet= new TreeSet<>(arrayList);

        h.printF(humanTreeSet);


    }
}
