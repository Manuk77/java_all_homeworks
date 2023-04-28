package org.all_homeworks.collections_and_generics.generics;
// homework ex 5.
public class PairOFObjects <T, E>{
    private T field1;
    private E field2;

    public PairOFObjects(T elem1, E elem2) {
        field1 = elem1;
        field2 = elem2;
    }

    @Override
    public String toString() {
        return "PairOFObjects {" +
                "field1 = " + field1 +
                ", field2 = " + field2 +
                '}';
    }
}
