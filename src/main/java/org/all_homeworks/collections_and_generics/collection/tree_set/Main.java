package org.all_homeworks.collections_and_generics.collection.tree_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import static org.collection_homework.collection.tree_set.HumanTreeSet.compareWithAge;

public class Main {

    public static void main(String[] args) {


        TreeSet<HumanTreeSet> treeSets = new TreeSet<>();

        treeSets.add(new HumanTreeSet("Areg", 22));
        treeSets.add(new HumanTreeSet("Ardavazd", 21));
        treeSets.add(new HumanTreeSet("Varazdat", 37));
        treeSets.add(new HumanTreeSet("Garik", 74));
        treeSets.add(new HumanTreeSet("Vacho Papi", 80));

        ArrayList<HumanTreeSet> arrayList = new ArrayList<>(treeSets);
        Collections.sort(arrayList, compareWithAge);

        treeSets = new TreeSet<>(arrayList);

        HumanTreeSet hts = new HumanTreeSet();
        hts.printF(treeSets);

        TreeSet<Integer> int1 = new TreeSet<>();
        int1.add(7);
        int1.add(8);
        int1.add(3);
        int1.add(5);
        int1.add(6);


        TreeSet<Integer> int2 = new TreeSet<>();
        int2.add(7);
        int2.add(1);
        int2.add(0);
        int2.add(5);
        int2.add(3);

        TreeSet<Integer> temp = new TreeSet<>();

        MismatchedElementsTwoTrees ms = new MismatchedElementsTwoTrees();

        ms.print(int1);
        System.out.println();

        ms.print(int2);
        System.out.println();
        temp = ms.commonElementBetween(int1, int2);

        ms.print(temp);

        TreeSet<String > str = new TreeSet<>();
        str.add("areg");
        str.add("mane");
        str.add("arman");
        str.add("arman");
        str.add("areg");

        UniqueWordsTreeSet set = new UniqueWordsTreeSet();
        set.print(set.uniqueWordsIgnoreCase(str));



    }
}
