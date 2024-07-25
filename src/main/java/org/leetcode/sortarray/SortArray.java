package org.leetcode.sortarray;
/**
 * @author israel
 * Daily problem leetcode 2024-07-25
 * <a href="https://leetcode.com/problems/sort-an-array/description/?envType=daily-question&envId=2024-07-25">...</a>
 */
public class SortArray {
    //https://www.geeksforgeeks.org/shell-sort/
    public int[] sortArray(int[] nums) {

        int n = nums.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i ++)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = nums[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && nums[j - gap] > temp; j -= gap) {
                    nums[j] = nums[j - gap];
                }
                // put temp (the original a[i]) in its correct
                // location
                nums[j] = temp;
            }
        }
        return nums;
    }
}
