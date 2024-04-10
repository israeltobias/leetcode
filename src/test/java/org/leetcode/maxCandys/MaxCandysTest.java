package org.leetcode.maxCandys;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxCandysTest {

    @Test
    void kidsWithCandies() {
        MaxCandys mc = new MaxCandys();
        int[] candies = {2,3,5,1,3};
        List<Boolean> resCandies = Arrays.asList(true,true,true,false,true);
        List<Boolean> response = mc.kidsWithCandies(candies, 3);
        int[] candies1 = {4,2,1,1,2};
        List<Boolean> resCandies1 = Arrays.asList(true,false,false,false,false);
        List<Boolean> response1 = mc.kidsWithCandies(candies1, 1);
        int[] fail = {2,8,7};
        List<Boolean> responseFailBool = Arrays.asList(false,true,true);
        List<Boolean> responseFail = mc.kidsWithCandies(fail,1);

        System.out.println(response);
        System.out.println(response1);
        System.out.println(responseFail);
        assertEquals(candies.length,response.size());
        assertEquals(resCandies, response);
        assertEquals(candies1.length,response1.size());
        assertEquals(resCandies1, response1);
        assertEquals(fail.length,responseFail.size());
        assertEquals(responseFail, responseFailBool);
    }
}