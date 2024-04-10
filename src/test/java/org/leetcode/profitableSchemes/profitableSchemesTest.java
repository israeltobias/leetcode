package org.leetcode.profitableSchemes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class profitableSchemesTest {

    @Test
    void profitableSchemesTest (){
        ProfitableSchemes ps = new ProfitableSchemes();
       int n = 5, minProfit = 3;
        int[] group = {2,2}, profit = {2,3};
        int res = ps.profitableSchemes(n, minProfit, group, profit);
        assertEquals(res,2);
    }

}