package org.all_homeworks.collections_and_generics.collection.hash_map;
import java.util.HashMap;
public class LongestConsecutiveSubsequence {

    public static int longestConsecutiveSubsequence(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int num : nums) {
            map.put(num, false);
        }

        int longestLength = 0;
        for (int num : nums) {
            if (map.get(num) == false) {
                map.put(num, true);
                int currentLength = 1;

                int left = num - 1;
                while (map.containsKey(left) && map.get(left) == false) {
                    map.put(left, true);
                    currentLength++;
                    left--;
                }

                int right = num + 1;
                while (map.containsKey(right) && map.get(right) == false) {
                    map.put(right, true);
                    currentLength++;
                    right++;
                }

                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }
}

