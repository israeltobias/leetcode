package org.leetcode.pascatriangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @Test
    void Test1(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<Integer> response = pascalTriangle.getRow(3);
        List<Integer> expected = Arrays.asList(1,3,3,1);
        assertEquals(expected,response);

    }
}