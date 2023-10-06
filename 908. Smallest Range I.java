class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        int currentDiff = maxVal - minVal;
        int smallestPossibleDiff = currentDiff - 2 * k;

        return (smallestPossibleDiff <= 0) ? 0 : smallestPossibleDiff;        
    }
}