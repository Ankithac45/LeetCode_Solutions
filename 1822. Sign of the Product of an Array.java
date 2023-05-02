class Solution {
    public int arraySign(int[] nums) {
        double product=nums[0];
        
        for(int i=1;i<nums.length;i++){
            product=product*nums[i];
        }

        if(product>0){
            return 1;
        }else if(product <0){
            return -1;
        }else{
            return 0;
        }
    }
}