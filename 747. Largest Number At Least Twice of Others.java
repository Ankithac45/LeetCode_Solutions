class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        
        // Find the index of the largest element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Check if the largest element is at least twice as much as every other number
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < nums[i] * 2) {
                return -1;
            }
        }
        
        return maxIndex;
    }
}