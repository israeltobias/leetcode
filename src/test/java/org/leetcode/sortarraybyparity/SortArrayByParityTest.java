package org.leetcode.sortarraybyparity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void test1 () {
        int[] nums = {3,1,2,4};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] result = sortArrayByParity.sortArrayByParity(nums);
        int[] expected = {2,4,3,1};
      //  assertArrayEquals( expected, result);
        assertThat(expected).contains(result);
    }
    @Test
    void test2 () {
        int[] nums = {0};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] result = sortArrayByParity.sortArrayByParity(nums);
        int[] expected = {0};
        //  assertArrayEquals( expected, result);
        assertThat(expected).contains(result);
    }
}