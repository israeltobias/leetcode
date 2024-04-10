package org.leetcode.longestsubsequence;

import java.util.HashMap;
import java.util.Map;/**
 * @author israel
 * Daily problem leetcode 2023-07-14
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/description/
 */

public class LongestSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> dp = new HashMap<>();
        int ans = 1;
        for (int a: arr) {
            int partial = dp.getOrDefault(a - difference,0);
            dp.put(a,partial+1);
            ans = Math.max( ans,dp.get(a));
        }
        return ans;
    }
   /* public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int answer = 1;

        for (int a : arr) {
            int beforeA = dp.getOrDefault(a - difference, 0);
            dp.put(a, beforeA + 1);
            answer = Math.max(answer, dp.get(a));
        }

        return answer;
    }*/
}
