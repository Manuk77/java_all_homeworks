package org.all_homeworks.collections_and_generics.collection.hash_map;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 4, 8, 5, 6};

        int longestConsecutiveSubsequence = LongestConsecutiveSubsequence.longestConsecutiveSubsequence(arr);
        System.out.println("longest consecutive subsequence -> " + longestConsecutiveSubsequence);

        String[] arrStr = new String[]{"dog", "god", "cat", "act", "ice", "cie"};

       int anagramPairsCount = AnagramPairs.countAnagramPairs(arrStr);
        System.out.println("anagram pairs -> " + anagramPairsCount);
    }
}
