package org.leetcode.finddifference;
/**
 * @author israel
 * Daily problem leetcode 2023-09-25
 * https://leetcode.com/problems/find-the-difference/description/?envType=daily-question&envId=2023-09-25
 */
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if(freq[i] != 0) {
                return (char) i;
            }
        }
        return Character.MIN_VALUE;
    }

    public char findTheDifferenceBit(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) {
            c ^= cs;
        }
        for(char ct : t.toCharArray()) {
            c ^= ct;
        }
        return c;
    }
}
