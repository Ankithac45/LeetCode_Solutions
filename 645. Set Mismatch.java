class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                result[0] = num; 
            } else {
                seen.add(num);
                actualSum += num;
            }
        }

        result[1] = (int) (expectedSum - actualSum); 

        return result;         
    }
}