class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ele=-1;
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(nums2[j]<=nums1[i]){
                if(nums1[i]==nums2[j]){
                    if(ele==-1){
                        ele=nums1[i];
                    }else if(nums1[i]<ele){
                        ele=nums1[i];
                    }
                }
                j++;
            }else{
                i++;
            }
        }
        return ele;
    }
}