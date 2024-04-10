package org.leetcode.FindMedian;

import java.util.Arrays;

/**
 * @author israel
 * Daily problem leetcode 2023-09-21
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=daily-question&envId=2023-09-21
 */
public class FindMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthN1 = nums1.length, lengthN2 = nums2.length, lengthMerge = lengthN1+lengthN2;
        int[] merge = new int[lengthN1+lengthN2];
        for (int i = 0; i < lengthN1; i++) {
            merge[i] = nums1[i];
        }
        for (int j = 0; j < lengthN2; j++) {
            merge[j+lengthN1] = nums2[j];
        }
        Arrays.sort(merge);
        int middle = lengthMerge /2;
        if(lengthMerge%2 ==0){
            return (double)(merge[middle] + merge[middle-1]) / 2.0;
        }
        return (double)merge[middle];
    }
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        // Get the sizes of both input arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}
