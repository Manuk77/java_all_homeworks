package org.all_homeworks.collections_and_generics.collection.linked_hash_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static org.collection_homework.collection.linked_hash_set.HumanLinked.compareWithAge;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        RemoveEvenNumber removeEvenNumber = new RemoveEvenNumber();
        removeEvenNumber.print(list);
        removeEvenNumber.removeEvenNumbers(list);
        removeEvenNumber.print(list);

        HumanLinked hl = new HumanLinked();

        LinkedHashSet<HumanLinked> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new HumanLinked("Areg", 22));
        linkedHashSet.add(new HumanLinked("Sergey", 19));
        linkedHashSet.add(new HumanLinked("Vahram", 21));
        linkedHashSet.add(new HumanLinked("Vahram", 24));
        linkedHashSet.add(new HumanLinked("Sergey", 27));
        linkedHashSet.add(new HumanLinked("Ani", 22));

        hl.print(linkedHashSet);

        ArrayList<HumanLinked> arrayList = new ArrayList<>(linkedHashSet);

        Collections.sort(arrayList, compareWithAge);

        TreeSet<HumanLinked> humanLinked = new TreeSet<>(arrayList);

        hl.print(humanLinked);

        linkedHashSet = removeEvenNumber.removeDuplicateName(linkedHashSet);
        removeEvenNumber.prints(linkedHashSet);

    }
}
