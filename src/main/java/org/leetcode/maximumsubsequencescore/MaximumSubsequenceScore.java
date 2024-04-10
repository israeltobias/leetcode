package org.leetcode.maximumsubsequencescore;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author israel
 * Daily problem leetcode 2023-05-24
 * https://leetcode.com/problems/maximum-subsequence-score/description/
 */
public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int size = nums1.length;
        long totalSum = 0;
        int[][] pairs = new int[size][2];
        long res = 0;
        for (int i = 0; i < size; i++) {
            pairs[i] = new int[] {nums2[i],nums1[i]};
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,(a,b) -> a-b);
        for (int[] pair: pairs) {
            pq.add(pair[1]);
            totalSum += pair[1];
            if (pq.size() > k) {
                totalSum -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, totalSum * pair[0]);
            }
        }

        return res;
    }
}
