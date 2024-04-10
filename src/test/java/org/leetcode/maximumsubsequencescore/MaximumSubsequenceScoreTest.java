package org.leetcode.maximumsubsequencescore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MaximumSubsequenceScoreTest {

    @Test
    void case1() {
        MaximumSubsequenceScore maximumSubsequenceScore = new MaximumSubsequenceScore();
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int k = 3;
        long res = maximumSubsequenceScore.maxScore(nums1, nums2, k);
        assertEquals(12,res);
    }

    @Test
    void case2() {
        MaximumSubsequenceScore maximumSubsequenceScore = new MaximumSubsequenceScore();
        int[] nums1 = {4,2,3,1,1};
        int[] nums2 = {7,5,10,9,6};
        int k = 1;
        long res = maximumSubsequenceScore.maxScore(nums1, nums2, k);
        assertEquals(30,res);
    }
}