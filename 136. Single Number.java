class Solution {
    public int singleNumber(int[] nums) {
        int count=1;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                if(count==1){
                    return nums[i-1];
                }
                count=1;
                if(i==nums.length-1 && count==1){
                    return nums[i];
                }
            }
        }
        return nums[0];
    }
}