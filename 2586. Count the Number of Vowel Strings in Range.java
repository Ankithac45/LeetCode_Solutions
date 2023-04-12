class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int n=words[i].length()-1;
            if((words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u') && (words[i].charAt(n)=='a' || words[i].charAt(n)=='e' || words[i].charAt(n)=='i' || words[i].charAt(n)=='o' || words[i].charAt(n)=='u') ){
                count++;
            }
        }
        return count;
    }
}