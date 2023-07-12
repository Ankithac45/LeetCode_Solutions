class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums.length == 0) {
            return result;
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    result.add(Integer.toString(start));
                } else {
                    result.add(start + "->" + end);
                }
                
                start = nums[i];
                end = nums[i];
            }
        }
        
        if (start == end) {
            result.add(Integer.toString(start));
        } else {
            result.add(start + "->" + end);
        }
        
        return result; 
    }
}