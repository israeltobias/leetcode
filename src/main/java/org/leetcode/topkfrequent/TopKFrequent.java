package org.leetcode.topkfrequent;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author israel
 * Daily problem leetcode 2023-05-22
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int value : map.keySet()){
            queue.offer(value);
        }
        int[] response = new int[k];
        for (int i = 0; i < k; i++) {
            response[i] = queue.poll();
        }
        return response;
    }
}
