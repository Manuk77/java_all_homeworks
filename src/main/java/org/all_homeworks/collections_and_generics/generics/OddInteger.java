package org.all_homeworks.collections_and_generics.generics;

public class OddInteger implements SpecificCollectionProperty.Property<Integer> {
    @Override
    public boolean hasProperty(Integer elem) {
        return elem % 2 != 0;
    }
}
