class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : freqMap.keySet()) {
            int count = freqMap.get(num);

            if (freqMap.containsKey(num + 1)) {
                int length = count + freqMap.get(num + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;        
    }
}