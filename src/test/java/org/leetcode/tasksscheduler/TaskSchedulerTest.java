package org.leetcode.tasksscheduler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {

    @Test
    void test() {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        TaskScheduler taskScheduler = new TaskScheduler();
        int response=taskScheduler.leastInterval(tasks,n);
        assertEquals(8,response);
    }

    @Test
    void test1() {
        char[] tasks = {'A','C','A','B','D','B'};
        int n = 1;
        TaskScheduler taskScheduler = new TaskScheduler();
        int response=taskScheduler.leastInterval(tasks,n);
        assertEquals(6,response);
    }
    @Test
    void test2() {
        char[] tasks = {'A','A','A', 'B','B','B'};
        int n = 3;
        TaskScheduler taskScheduler = new TaskScheduler();
        int response=taskScheduler.leastInterval(tasks,n);
        assertEquals(10,response);
    }
}