class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;
        
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i]))
                maxPrime = Math.max(maxPrime, nums[i][i]);
        }
        
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][n - i - 1]))
                maxPrime = Math.max(maxPrime, nums[i][n - i - 1]);
        }
        
        return maxPrime;
    }
    
    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        
        if (num == 2)
            return true;
        
        if (num % 2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
}

