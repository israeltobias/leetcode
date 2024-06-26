package org.leetcode.tasksscheduler;

import java.util.Arrays;

/**
 * @author israel
 * Daily problem leetcode 2024-03-19
 * <a href="https://leetcode.com/problems/task-scheduler/description/?envType=daily-question&envId=2024-03-19">...</a>
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25] - 1;
        int idle = chunk * n;

        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(chunk, freq[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;
    }
}
