package org.leetcode.mintaps;

/**
 * @author israel
 * Daily problem leetcode 2023-08-31
 * https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/description/
 */
public class MinTaps {
    int minTaps(int n, int[] ranges) {
        int min = 0, max = 0, count = 0;
        while (max < n) {
            for (int i = 0; i < ranges.length; i++) {
                if (i - ranges[i] <= min && i + ranges[i] >= max) {
                    max = i + ranges[i];
                }
            }
            if (max == min) return -1;
            count++;
            min = max;
        }
        return count;
    }
    int myMinTaps(int n, int[] ranges){
        //Not workin properly
        int res = -1;
        for (int i = 0; i < ranges.length; i++) {
            if (i - ranges[i] <= 0 && i + ranges[i] >= n) {
                res = i;
            }
        }
        return res;
    }
}
