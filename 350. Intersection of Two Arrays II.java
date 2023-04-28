class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int k=0;
        int[] res=new int[Math.min(nums1.length,nums2.length)];

        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res[k++]=nums1[i];
                i++;
                j++;
            }else{
                if(nums2[j]<nums1[i]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        int[] result = new int[k];
        for (int l = 0; l < k; l++) {
            result[l] = res[l];
        }
        return result;
    }
}