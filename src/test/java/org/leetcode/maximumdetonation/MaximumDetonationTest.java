package org.leetcode.maximumdetonation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDetonationTest {

    @Test
    public void Test1 (){
        int bombs[][]  ={{1,1,5},{10,10,5}};
        MaximumDetonation maximumDetonation = new MaximumDetonation();

        int response = maximumDetonation.maximumDetonation(bombs);

        assertEquals(1, response);
    }

}