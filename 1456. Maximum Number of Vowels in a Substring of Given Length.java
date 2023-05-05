class Solution {
    public int maxVowels(String s, int k) {
        int max_count=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            if(i>=k && isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(i>=k-1){
                max_count=Math.max(count,max_count);
            }
        }
        return max_count;
    }
    
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
