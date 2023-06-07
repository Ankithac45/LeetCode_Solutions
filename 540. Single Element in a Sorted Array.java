class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            // If the mid index is even and the next element is the same as mid,
            // then the single element is on the right side.
            // Otherwise, it is on the left side.
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid;
                }
            }
            // If the mid index is odd and the previous element is the same as mid,
            // then the single element is on the right side.
            // Otherwise, it is on the left side.
            else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        return nums[left];
    }
}