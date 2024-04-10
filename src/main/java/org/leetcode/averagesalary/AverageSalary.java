package org.leetcode.averagesalary;

import java.util.Arrays;

/**
 * @author israel
 * Daily problem leetcode 2023-05-01
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class AverageSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int size = salary.length;
        double div = size-2;
        int sum = 0;
        for (int i = 1; i < size-1; i++) {
            sum += salary[i];
        }
        return (double) sum/div;
    }
}
