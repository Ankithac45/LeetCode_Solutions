class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        
        Stack<Integer> stack = new Stack<>();
        int maxVal = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < maxVal) {
                return true;
            }
            
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                maxVal = stack.pop();
            }
            
            stack.push(nums[i]);
        }
        
        return false;       
    }
}