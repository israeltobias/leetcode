package org.leetcode.sortarraybyparity;
/**
 * @author israel
 * Daily problem leetcode 2023-09-28
 * https://leetcode.com/problems/sort-array-by-parity/description/?envType=daily-question&envId=2023-09-28
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0, odd = nums.length-1;

        for (int num: nums) {
            if(num % 2 ==0) {
                result[even] = num;
                even++;
            } else {
                result[odd] = num;
                odd--;
            }
        }
        return result;
    }
}
