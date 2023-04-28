package org.all_homeworks.collections_and_generics.generics;
import java.util.Collection;
public class SpecificCollectionProperty {
        public static <T> int countElements(Collection<T> collection, Property<T> property) {
            int count = 0;
            for (T element : collection) {
                if (property.hasProperty(element)) {
                    count++;
                }
            }
            return count;
        }

    interface Property<T> {
        boolean hasProperty(T element);
    }




}
