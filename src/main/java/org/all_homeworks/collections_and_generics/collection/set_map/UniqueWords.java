package org.all_homeworks.collections_and_generics.collection.set_map;

import java.util.HashSet;

public class UniqueWords {


    public HashSet<String> uniqueWordsIgnoreCase(HashSet<String> set) {
        if (!checkHashSet(set)) {
            HashSet<String> uniqueSet = new HashSet<>();
            for (String str : set) {
                if (!uniqueSet.contains(str))
                    uniqueSet.add(str);
            }
            return uniqueSet;
        }
        throw new NullPointerException("specified hashSet must not be null");
    }

    private boolean checkHashSet(HashSet<String> set) {
        return set == null;
    }

    public <E> void print(HashSet<E> e) {
        for(E e1: e) {
            System.out.println(e1);
        }
    }
}
