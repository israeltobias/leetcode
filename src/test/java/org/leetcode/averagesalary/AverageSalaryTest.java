package org.leetcode.averagesalary;

import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryTest {

    @Test
    void averageSalary() {
        AverageSalary averageSalary = new AverageSalary();
        int[] salary = {4000,3000,1000,2000};
        double avg = averageSalary.average(salary);
        int[] salary2 = {1000,2000,3000};
        double avg2 = averageSalary.average(salary2);
        int[] salary3 = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double avg3 = averageSalary.average(salary3);
        int[] salary4 = {0};
        double avg4 = averageSalary.average(salary4);
        assertEquals(2500.00000,(double)Math.round(avg * 100000d) / 100000d);
        assertEquals(2000.00000,(double)Math.round(avg2 * 100000d) / 100000d);
        assertEquals(41111.11111,(double)Math.round(avg3 * 100000d) / 100000d);
        assertEquals(0.00000,(double)Math.round(avg4 * 100000d) / 100000d);
    }
}