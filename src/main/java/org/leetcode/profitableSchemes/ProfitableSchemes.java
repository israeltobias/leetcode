package org.leetcode.profitableSchemes;
/**
 * @author israel
 * Daily problem leetcode 2023-04-21
 * https://leetcode.com/problems/profitable-schemes/description/
 * Knacksap problem -> https://algorithm-visualizer.org/dynamic-programming/knapsack-problem
 */
public class ProfitableSchemes {
    //avoid overflow --> https://www.geeksforgeeks.org/modulo-1097-1000000007/
    private int mod = (int)1e9 + 7;
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        for (int k = 1; k <= group.length; k++) {
            int g = group[k - 1];
            int p = profit[k - 1];
            for (int i = n; i >= g; i--) {
                for (int j = minProfit; j >= 0; j--) {
                    dp[i][j] = (dp[i][j] + dp[i - g][Math.max(0, j - p)])%mod;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = (sum + dp[i][minProfit])%mod;
        }
        return sum;
    }
}
