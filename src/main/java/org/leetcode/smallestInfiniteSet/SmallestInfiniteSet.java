package org.leetcode.smallestInfiniteSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/**
 * @author israel
 * Daily problem leetcode 2023-04-25
 * https://leetcode.com/problems/smallest-number-in-infinite-set/description/
 */
public class SmallestInfiniteSet {
    Set<Integer> set;
    int current;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        current = 1;
    }

    public int popSmallest() {

        if(!set.isEmpty()){
           int res = Collections.min(set);
           set.remove(res);
           return res;
        } else {
            current++;
            return current -1;
        }
    }

    public void addBack(int num) {
        if(current > num) {
            set.add(num);
        }
    }
}
