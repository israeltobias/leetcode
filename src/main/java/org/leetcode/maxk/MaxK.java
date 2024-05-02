package org.leetcode.maxk;

import java.util.Arrays;
/**
 * @author israel
 * Daily problem leetcode 2024-05-02
 * <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=daily-question&envId=2024-04-15">...</a>
 */
public class MaxK {

    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >=0 ; i--) {
         if(Arrays.binarySearch(nums,-nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findMaxK2(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >=0 ; i--) {
            if(existNegative(nums,-nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

    boolean existNegative(int[] nums, int k) {
        for (int num : nums) {
            if (num < 0 && num == k) {
                return true;
            }
        }
        return false;
    }
}
