class Solution {
    public int searchInsert(int[] nums, int target) {
        int val=0; //store the index value
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                val=i;
                break;
            }else if(nums[i]<target && i==nums.length-1){
                val=nums.length;
                //val=i+1;
            }
        }
        return val;
    }
}