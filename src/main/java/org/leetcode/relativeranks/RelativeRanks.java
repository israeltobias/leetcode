package org.leetcode.relativeranks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author israel
 * Daily problem leetcode 2024-05-08
 * <a href="https://leetcode.com/problems/relative-ranks/?envType=daily-question&envId=2024-05-08">...</a>
 */
public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        String[] response = new String[score.length];
        Integer[] sorted = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        Map<Integer,String> map =new HashMap<>();
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < sorted.length; i++) {
            if(i<3) {
                map.put(sorted[i],medals[i]);
            } else {
                map.put(sorted[i],Integer.toString(i+1));
            }
        }
        for (int i = 0; i < score.length; i++)
        {
            response[i] = map.get(score[i]);
        }
        return response;
    }
}
