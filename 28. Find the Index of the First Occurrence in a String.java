class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        int i=0;
        int j=0;
        int count=0; //matched characters
        int idx=-1; //store the first occurence of the matched character

        while(i<m && j<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                count++;
                i++;
                j++;
                if(count==n){
                    idx=i-n;
                    break;
                }
            }else{
                count=0;
                i=i-j+1;
                j=0;
            }
        }
        return idx;
    }
    
}