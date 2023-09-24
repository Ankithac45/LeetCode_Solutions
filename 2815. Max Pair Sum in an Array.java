class Solution {
    public int maxSum(int[] nums) {
        int[] maxSumWithDigit = new int[10]; 
        Arrays.fill(maxSumWithDigit, Integer.MIN_VALUE);
        int result = -1;

        for (int num : nums) {
            int maxDigit = 0;
            int n = num;

            while (n > 0) {
                maxDigit = Math.max(maxDigit, n % 10);
                n /= 10;
            }

            if (maxSumWithDigit[maxDigit] != Integer.MIN_VALUE) {
                result = Math.max(result, maxSumWithDigit[maxDigit] + num);
            }

            maxSumWithDigit[maxDigit] = Math.max(maxSumWithDigit[maxDigit], num);
        }

        return result;        
    }
}