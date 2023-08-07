class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n - 1; i++) {
            dp[i] = Math.max(dp[i - 1], (nums[i] + dp[i - 2]));
        }
        int result1 = dp[n - 2];

        dp[0] = 0;
        dp[1] = nums[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], (nums[i] + dp[i - 2]));
        }
        int result2 = dp[n - 1];

        return Math.max(result1, result2);

        //Optimal Approach
        // int n = nums.length;
        // if (n == 0) return 0;
        // if (n == 1) return nums[0];

        // int prev2 = nums[0];
        // int prev = Math.max(nums[0], nums[1]);
        // int curr = prev;

        // for (int i = 2; i < n - 1; i++) {
        //     curr = Math.max(prev, prev2 + nums[i]);
        //     prev2 = prev;
        //     prev = curr;
        // }
        // int result1 = curr;

        // prev2 = 0;
        // prev = nums[1];
        // curr = prev;

        // for (int i = 2; i < n; i++) {
        //     curr = Math.max(prev, prev2 + nums[i]);
        //     prev2 = prev;
        //     prev = curr;
        // }
        // int result2 = curr;

        // return Math.max(result1, result2);
    }
}