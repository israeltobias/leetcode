/**
 * @author israel
 * Daily problem leetcode 2023-05-18
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/description/
 */
package org.leetcode.findsmallestsetofvertices;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestSetOfVerticesTest {

    @Test
    void findSmallestSetOfVertices() {
        int n = 6;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(2,5));
        edges.add(Arrays.asList(3,4));
        edges.add(Arrays.asList(4,2));
        FindSmallestSetOfVertices smallestSetOfVertices = new FindSmallestSetOfVertices();

        List<Integer> response = smallestSetOfVertices.findSmallestSetOfVertices(n, edges);

        assertEquals(0,response.get(0));
        assertEquals(3,response.get(1));
    }

}