package org.all_homeworks.collections_and_generics.collection.tree_set;


import java.util.TreeSet;

public class MismatchedElementsTwoTrees {

    /**
     * Generic method:
     * This method checks if the element of firs treeSet exists in second hashSet and adds in commonElement:
     * @param treeSet1 specified firs treeSet:
     * @param treeSet2 specified second treeSet:
     * @return TreeSet generic type:
     * @param <E> generic type of treeSet:
     * @throws IllegalStateException when one of specified treeSet is empty:
     * @throws NullPointerException when one of specified treeSet is empty:
     */
    public  <E> TreeSet<E> commonElementBetween(TreeSet<E> treeSet1, TreeSet<E> treeSet2) throws IllegalStateException, NullPointerException {
        TreeSet<E> commonElem = new TreeSet<>();
        if (!issNull(treeSet1) || !issNull(treeSet2)) {
            if (!treeSet1.isEmpty() || !treeSet2.isEmpty()) {

                for (E x: treeSet1) {
                    if (!treeSet2.contains(x))
                        commonElem.add(x);
                }
                return commonElem;
            }
            throw new IllegalStateException("the given set must not be empty");
        }
        throw new NullPointerException("given set must not be null");
    }

    /**
     * Generic method:
     * this method checks, is the specified treeSet null:
     * @param treeSet specified treeSet
     * @return ture if specified treeSet null, else false:
     * @param <E> Generic type:
     */
    private <E> boolean issNull(TreeSet<E> treeSet) {
        return treeSet == null;
    }

    public <E> void print(TreeSet<E> treeSet) {
        if (!issNull(treeSet)) {
            for (E e: treeSet) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
