package org.leetcode.laststoneweight;

import java.util.PriorityQueue;

/**
 * @author israel
 * Daily problem leetcode 2023-04-24
 * https://leetcode.com/problems/last-stone-weight/description/
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>( (a,b) -> b-a);
        int size = stones.length;
        for (int i = 0; i < size; i++) {
            queue.add(stones[i]);
        }
        while (queue.size() >1 ){
            int val1 = queue.poll();
            int val2 = queue.poll();
            queue.offer(Math.abs(val1-val2));
        }
        return queue.poll();
    }
}
