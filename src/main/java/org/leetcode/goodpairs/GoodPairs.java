package org.leetcode.goodpairs;

import java.util.HashMap;

/**
 * @author israel
 * Daily problem leetcode 2023-10-03
 * https://leetcode.com/problems/number-of-good-pairs/?envType=daily-question&envId=2023-10-03
 */
public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int count = 0;
        for (int num: nums ) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }
}
