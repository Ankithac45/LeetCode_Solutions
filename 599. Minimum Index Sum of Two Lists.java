class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        
        for (int j = 0; j < list2.length; j++) {
            String currentString = list2[j];
            if (indexMap.containsKey(currentString)) {
                int indexSum = j + indexMap.get(currentString);
                
                // Check if this is the minimum index sum found so far
                if (indexSum < minIndexSum) {
                    result.clear();
                    result.add(currentString);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    result.add(currentString);
                }
            }
        }

        return result.toArray(new String[result.size()]);        
    }
}