class Solution {
    public int sumOfUnique(int[] nums) {
        // Create a HashMap to count occurrences of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Compute the sum of unique elements
        int sum = 0;
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                sum += num;
            }
        }
        
        return sum;
    }
}
