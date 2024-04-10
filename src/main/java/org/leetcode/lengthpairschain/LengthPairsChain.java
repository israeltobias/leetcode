package org.leetcode.lengthpairschain;

import java.util.Arrays;

/**
 * @author israel
 * Daily problem leetcode 2023-08-26
 * https://leetcode.com/problems/maximum-length-of-pair-chain/description/
 */
public class LengthPairsChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int cur = Integer.MIN_VALUE, ans = 0;

        for (int[] pair : pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                ans++;
            }
        }

        return ans;
    }
}
