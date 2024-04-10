package org.leetcode.topkfrequent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {

    @Test
    void topKFrequent(){
        int[] nums= {1,1,1,2,2,3};
        int k = 2;
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] response = topKFrequent.topKFrequent(nums, k);
        assertArrayEquals(new int[]{1, 2},response);
    }

}