class Solution {
    private int firstt(int[]nums, int target){
        int first = -1;
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid - 1;
            }else if (nums[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }

    private int lastt(int[]nums, int target){
        int last = -1;
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid + 1;
            }else if(nums[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstIndex = firstt(nums, target);
        int lastIndex = lastt(nums, target);
        return new int[]{firstIndex, lastIndex};
    }
}