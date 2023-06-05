class Solution {
    public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];
    
    // Find the intersection point of the two pointers
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);
    
    // Move one pointer to the start and keep the other at the intersection point
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }
    
    // Return the repeated number
    return slow;
    }
}