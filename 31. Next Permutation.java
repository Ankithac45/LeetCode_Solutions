class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(nums);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        Arrays.sort(nums, index + 1, n);
    }
}