class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while (k > 0 && i < nums.length) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
            i++;
        }
        Arrays.sort(nums);
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;        
    }
}