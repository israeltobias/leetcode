package org.leetcode.sortcolors;
/**
 * @author israel
 * Daily problem leetcode 2024-06-12
 * <a href="https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2024-06-12">...</a>
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[j] < nums[i]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
    }

    public void sortColors1(int[] nums){
        int low =0, mid=0, high = nums.length -1;
        while (mid <= high){
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
