package org.leetcode.gasstation;

public class GasStation {
    public GasStation() {
        super();
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int actualGas = 0;
        int total = 0;
        int index = 0;
        int size = cost.length;

        for (int i = 0; i < size; i++) {
            actualGas += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (actualGas < 0) {
                actualGas = 0;
                index = i +1;
            }
        }
        return total<0?-1:index;
    }
}
