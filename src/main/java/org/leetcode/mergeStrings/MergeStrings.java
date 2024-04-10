package org.leetcode.mergeStrings;

/**
 * @author israel
 * Daily problem leetcode 2023-04-18
 * https://leetcode.com/problems/merge-strings-alternately/description/
 */
public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        int sizeWord1 = word1.length();
        int sizeWord2 = word2.length();
        int i = 0;
        StringBuilder merged = new StringBuilder();
        while (i<sizeWord1 || i<sizeWord2) {
            if (i<sizeWord1) {
                merged.append(word1.charAt(i));
            }
            if(i<sizeWord2) {
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}
