class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> sets=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            sets.add(jewels.charAt(i));
        }

        int count=0;
        for(int i=0;i<stones.length();i++){
            if(sets.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}