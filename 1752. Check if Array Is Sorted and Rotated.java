class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean isIncreasing = true;
        
	int pivot = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
		pivot = i;
                isIncreasing = false;
                break;
            }
        }
        
        if (isIncreasing) {
            return true; // Array is already sorted in non-decreasing order
        }
        
        int rotation = n - pivot;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + rotation) % n] = nums[i];
        }
        
        for (int i = 1; i < n; i++) {
            if (rotatedArray[i] < rotatedArray[i - 1]) {
                return false;
            }
        }
        
        return true;
    }
}