class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int maxFreq = 0;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            int degree = freq.get(nums[i]);

            if (degree > maxFreq) {
                maxFreq = degree;
                minLen = i - first.get(nums[i]) + 1;
            } else if (degree == maxFreq) {
                minLen = Math.min(minLen, i - first.get(nums[i]) + 1);
            }
        }

        return minLen;       
    }
}