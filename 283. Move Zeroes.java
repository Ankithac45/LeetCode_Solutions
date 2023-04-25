class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
