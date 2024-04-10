package org.leetcode.pascatriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author israel
 * Daily problem leetcode 2023-10-06
 * https://leetcode.com/problems/pascals-triangle-ii/?envType=daily-question&envId=2023-10-16
 */
public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int prev = row.get(i-1);
            //multiplication first
            long actual = (long) prev * (rowIndex -i + 1) / i;
            row.add( (int) actual);
        }
        return row;
    }
}
