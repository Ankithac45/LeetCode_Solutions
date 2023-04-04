class Solution {
    public boolean isPalindrome(String s) {
        // String reversed="";
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String reversed=new StringBuilder(s).reverse().toString();
        // for(int i=s.length()-1;i>=0;i--){
        //     reversed+=s.charAt(i);
        // }
        // if(revrsed==s)
        if(reversed.equals(s)){
            return true;
        }
        return false;
    }
}