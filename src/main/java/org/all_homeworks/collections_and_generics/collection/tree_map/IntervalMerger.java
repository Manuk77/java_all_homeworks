package org.all_homeworks.collections_and_generics.collection.tree_map;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class IntervalMerger {
    public static List<int[]> merge(List<int[]> intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            Integer floorKey = map.floorKey(start);
            if (floorKey != null && map.get(floorKey) >= start) {
                start = floorKey;
                end = Math.max(end, map.get(floorKey));
                map.remove(floorKey);
            }
            Integer ceilingKey = map.ceilingKey(start);
            while (ceilingKey != null && ceilingKey <= end) {
                end = Math.max(end, map.get(ceilingKey));
                map.remove(ceilingKey);
                ceilingKey = map.ceilingKey(start);
            }
            map.put(start, end);
        }
        List<int[]> mergedIntervals = new ArrayList<>();
        for (int start : map.keySet()) {
            int end = map.get(start);
            mergedIntervals.add(new int[]{start, end});
        }
        return mergedIntervals;
    }

    public static void print(List<int[]> mergedIntervals) {
        for (int[] intervals: mergedIntervals) {
            System.out.println("[" + intervals[0] + ", " + intervals[1] + "]");
        }
        System.out.println();
    }
}
