class Solution {
    public int removeDuplicates(int[] nums) {
    int count = 1; // count of occurrences of the current element
    int index = 1; // index for updating the array in-place
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            // If the current element is equal to the previous element,
            // increment the count of occurrences
            count++;
        } else {
            // If the current element is different from the previous element,
            // reset the count of occurrences
            count = 1;
        }
        
        if (count <= 2) {
            // If the count of occurrences is less than or equal to 2,
            // update the array in-place with the current element
            nums[index] = nums[i];
            index++;
        }
    }
    
    return index;
    }
}