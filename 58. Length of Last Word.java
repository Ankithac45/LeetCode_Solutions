class Solution {
    public int lengthOfLastWord(String s) {
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(s.charAt(i-1)==' '){
                    count=0;
                }
                count++;
            }
        }
        return count;
    }
}