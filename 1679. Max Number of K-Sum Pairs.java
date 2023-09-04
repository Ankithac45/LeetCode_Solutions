class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        for (int num : nums) {
            int complement = k - num;
            
            if (map.containsKey(complement) && map.get(complement) > 0) {
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        return count;
    }
}