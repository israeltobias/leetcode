package org.leetcode.twosum;

import java.util.*;

public class TwoSum {
    public TwoSum() {
        super();
    }

    public int[] twoSum(int[] nums, int target) {
        /*Object[] res = IntStream.range(0, nums.length).boxed()
                .flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> target == nums[i] + nums[j])
                        .mapToObj(j -> Arrays.asList(i, j).toArray()))
                .collect(Collectors.toList()).get(0);
        return new int[]{(int) res[0], (int) res[1]};*/
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }

        }
        return new int[]{0,0};
    }
}
