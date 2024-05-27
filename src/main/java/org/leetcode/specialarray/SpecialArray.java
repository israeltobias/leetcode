package org.leetcode.specialarray;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author israel
 * Daily problem leetcode 2024-05-27
 * <a href="https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/?envType=daily-question&envId=2024-05-27">...</a>
 */
public class SpecialArray {
    public int specialArray(int[] nums) {
        // Sort the array in descending order
        Integer[] numsDescending = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsDescending, Collections.reverseOrder());

        int n = numsDescending.length;

        // Iterate through each possible value of x (from 1 to n)
        for (int x = 1; x <= n; x++) {
            // Check how many numbers are greater than or equal to x
            if (numsDescending[x - 1] >= x && (x == n || numsDescending[x] < x)) {
                return x;
            }
        }

        return -1;
    }
}
