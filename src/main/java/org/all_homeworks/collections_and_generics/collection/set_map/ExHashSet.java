package org.all_homeworks.collections_and_generics.collection.set_map;

import java.util.HashSet;

public class ExHashSet {


    // ex 1. hashSet 1.
    /**
     * Generic method:
     * This method checks if the element of firs hashSet exists in second hashSet and adds in commonElement:
     * @param hashSet1 specified firs hashSet:
     * @param hashSet2 specified second hashSet:
     * @return HashSet generic type:
     * @param <E> generic type of hashSet:
     * @throws IllegalStateException when one of specified hashSet is empty:
     * @throws NullPointerException when one of specified hashSet is empty:
     */
    public  <E> HashSet<E> commonElementBetween(HashSet<E> hashSet1, HashSet<E> hashSet2) throws IllegalStateException, NullPointerException {
        HashSet<E> commonElem = new HashSet<>();
        if (!isNull(hashSet1) || !isNull(hashSet2)) {
            if (!hashSet1.isEmpty() || !hashSet2.isEmpty()) {

                for (E x: hashSet1) {
                    if (hashSet2.contains(x))
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
     * this method checks, is the specified hashSet null:
     * @param hashSet specified HashSet
     * @return ture if specified hashSet null, else false:
     * @param <E> Generic type:
     */
    private <E> boolean isNull(HashSet<E> hashSet) {
        return hashSet == null;
    }
}
