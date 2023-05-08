class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int index=nums.length-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int squareleft=nums[left]*nums[left];
            int squareright=nums[right]*nums[right];

            if(squareleft>squareright){
                result[index--]=squareleft;
                left++;
            }else{
                result[index--]=squareright;
                right--;
            }
        }
        return result;
    }
}
