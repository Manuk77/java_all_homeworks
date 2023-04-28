package org.all_homeworks.collections_and_generics.collection.hash_map;

import java.util.Arrays;
import java.util.HashMap;
public class AnagramPairs {
    public static int countAnagramPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int numPairs = 0;
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (map.containsKey(sortedWord)) {
                numPairs += map.get(sortedWord);
                map.put(sortedWord, map.get(sortedWord) + 1);
            } else {
                map.put(sortedWord, 1);
            }
        }

        return numPairs * 2;
    }
}
