package org.all_homeworks.collections_and_generics.collection.tree_map;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{8, 10});
        intervals.add(new int[]{15, 18});
        IntervalMerger.print(intervals);

        intervals = IntervalMerger.merge(intervals);
        IntervalMerger.print(intervals);
    }
}
