class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word="";
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        int j=0;
        for(int k=0;k<(n1+n2);k++){
            if((k%2)==0 && i<n1){
                word+=word1.charAt(i);
                i++;
            }else if((k%2)!=0 && j<n2){
                word+=word2.charAt(j);
                j++;
            }else if(i==n1 && j<n2){
                word+=word2.charAt(j);
                j++;
            }else if(j==n2 && i<n1){
                word+=word1.charAt(i);
                i++;
            }
        }
        return word;
    }
}