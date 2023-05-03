class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        //adding elemets to sets
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }

        ArrayList<Integer> diff1=new ArrayList<>();
        ArrayList<Integer> diff2=new ArrayList<>();

        //adding elements to arraylists
        for(int num:set1){
            if(! set2.contains(num)){
                diff1.add(num);
            }
        }
        for(int num:set2){
            if(! set1.contains(num)){
                diff2.add(num);
            }
        }

        List<List<Integer>> answer=new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);

        return answer;
    }
}
