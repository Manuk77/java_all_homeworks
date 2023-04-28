package org.all_homeworks.collections_and_generics.generics;

public class PrimeNumbers implements SpecificCollectionProperty.Property<Integer> {
    @Override
    public boolean hasProperty(Integer element) {
        // 1 is not prime number
        if (element == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(element); ++i) {
            if (element % i == 0)
                return false;
        }
        return true;
    }
}
