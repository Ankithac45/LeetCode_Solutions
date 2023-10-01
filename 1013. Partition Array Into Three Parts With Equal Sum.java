class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % 3 != 0) {
            return false;
        }
        
        int targetSum = totalSum / 3;
        int currentSum = 0;
        int count = 0;
        
        for (int num : arr) {
            currentSum += num;
            if (currentSum == targetSum) {
                count++;
                currentSum = 0;
            }
        }
        
        return (count==3 || (totalSum==0 && count>=3));        
    }
}