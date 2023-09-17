class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;  
        
        while (even < n && odd < n) {
            while (even < n && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < n && nums[odd] % 2 == 1) {
                odd += 2;
            }
            
            if (even < n && odd < n) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        
        return nums;        
    }
}