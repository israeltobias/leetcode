package org.leetcode.monotonicarray;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean dec = true, inc = true;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if(nums[i] > nums[i-1]) {
                inc = false;
            } else if ( nums[i] < nums[i-1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
