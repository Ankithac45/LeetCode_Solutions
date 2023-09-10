class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currentGas = 0;
        int startIdx = 0;

        for (int i = 0; i < n; i++) {
            int gasDiff = gas[i] - cost[i];
            
            totalGas += gasDiff;
            currentGas += gasDiff;
            
            if (currentGas < 0) {
                currentGas = 0;
                startIdx = i + 1;
            }
        }

        if (totalGas >= 0) {
            return startIdx;
        } else {
            return -1;
        }
    }
}
