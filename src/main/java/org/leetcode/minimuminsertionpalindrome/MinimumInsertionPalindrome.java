package org.leetcode.minimuminsertionpalindrome;
/**
 * @author israel
 * Daily problem leetcode 2023-04-22
 * https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/
 */
public class MinimumInsertionPalindrome {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }

    private int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[] dpPrev = new int[n];

        for (int start = n - 1; start >= 0; --start) {
            dp[start] = 1;
            for (int end = start + 1; end < n; ++end) {
                if (s.charAt(start) == s.charAt(end)) {
                    dp[end] = dpPrev[end - 1] + 2;
                } else {
                    dp[end] = Math.max(dpPrev[end], dp[end - 1]);
                }
            }
            dpPrev = dp.clone();
        }

        return dp[n - 1];
    }
}
