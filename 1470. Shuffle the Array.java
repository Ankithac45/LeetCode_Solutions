class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=1;i<nums.length;i=i+2){
                int temp=nums[i];
                nums[i]=nums[n];
                int j=n++;

                while(j!=i){
                    if(j==i+1){
                        nums[j]=temp;
                        break;
                    }else{
                        nums[j]=nums[j-1];
                        j--;
                    }
                }
        }
        return nums;
    }
}