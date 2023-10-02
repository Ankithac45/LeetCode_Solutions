class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProd = 1;
        int rightProd = 1;
        int maxP = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (leftProd == 0) leftProd = 1;
            if (rightProd == 0) rightProd = 1;
            leftProd *= nums[i];
            rightProd *= nums[n - i - 1];
            maxP = Math.max(maxP, Math.max(rightProd,leftProd));
        }
        
        return maxP;
    }
}