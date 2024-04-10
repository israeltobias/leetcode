package org.leetcode.maxCandys;

import java.util.ArrayList;
import java.util.List;


/**
 * @author israel
 * Daily problem leetcode 2023-04-17
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 */
public class MaxCandys {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =candies[0];
        int size = candies.length;
        for (int i = 1; i < size; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> response = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            response.add(candies[i] + extraCandies >= max);
        }
        return response;
    }
}
