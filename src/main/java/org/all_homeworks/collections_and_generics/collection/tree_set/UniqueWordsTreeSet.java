package org.all_homeworks.collections_and_generics.collection.tree_set;


import java.util.TreeSet;

public class UniqueWordsTreeSet {
    public TreeSet<String> uniqueWordsIgnoreCase(TreeSet<String> set) {
        if (!checkTreeSet(set)) {
            TreeSet<String> uniqueTreeSet = new TreeSet<>();
            for (String str : set) {
                if (!uniqueTreeSet.contains(str))
                    uniqueTreeSet.add(str);
            }
            return uniqueTreeSet;
        }
        throw new NullPointerException("specified hashSet must not be null");
    }

    private boolean checkTreeSet(TreeSet<String> set) {
        return set == null;
    }

    public <E> void print(TreeSet<E> e) {
        for(E e1: e) {
            System.out.println(e1);
        }
    }
}
