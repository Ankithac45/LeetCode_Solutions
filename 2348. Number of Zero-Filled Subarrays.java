class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long prev=0;
        long total_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && prev!=0){
                count=1;
                total_count+=count;
                prev=nums[i];
            }else if(nums[i]==0 && prev==0){
                count++;
                total_count+=count;
                prev=nums[i];
            }
            else{
                count=0;
                prev=nums[i];
            }
        }
        return total_count;
    }
}