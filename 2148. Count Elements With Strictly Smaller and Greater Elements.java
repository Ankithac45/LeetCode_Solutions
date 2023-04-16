class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int i=1;
        while(i<nums.length-1){
            if(nums[i]==nums[0] || nums[i]==nums[nums.length-1]){
                i++;
            }else{
                count++;
                i++;
            }
        }
        return count;
    }
}