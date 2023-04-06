class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res_count=1;
        int res=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(res_count<count){
                res_count=count;
                res=nums[i-1];
            }
        }
        return res;
    }
}