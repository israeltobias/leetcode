package org.leetcode.longestsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequenceTest {

    @Test
    void longestSubsequence_1 () {
        int[] arr = {1,5,7,8,5,3,4,2,1};
        int difference = -2;
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int response = longestSubsequence.longestSubsequence(arr,difference);
        assertEquals(4,response);
    }
    @Test
    void longestSubsequence_2 () {
        int[] arr = {6,2,1,3};
        int difference = -4;
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int response = longestSubsequence.longestSubsequence(arr,difference);
        assertEquals(2,response);
    }
}