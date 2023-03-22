class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int sum1=0; //right array sum
        //sum-sum1-nums[i] left sum of the array
        for(int j=0;j<nums.length;j++){
            if(sum-sum1-nums[j]== sum1){
                return j;
            }
            sum1+=nums[j];
        }
        return -1;
    }
}