class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int missingNumber = n;
        for(int i=0;i<n;i++){
            missingNumber ^=i^nums[i];
        }
        return missingNumber;
    }
};