class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] result = new int[n];
        
        int leftProd = 1;
        for (int i = 0; i < n; i++) {
            leftProduct[i] = leftProd;
            leftProd *= nums[i];
        }
        
        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProduct[i] = rightProd;
            rightProd *= nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        
        return result;
    }
}