class Solution {
    public String reverseWords(String s) {
        String temp=""; //strore each word
        String res=""; //store final reversed string
        int j=s.length()-1;
        //neglect all leading spaces 
        while(j>=0 && s.charAt(j)==' '){
            j--;
        }

        for(int i=j;i>=0;i--){
            if(s.charAt(i)!=' ' && i==0){
                temp+=s.charAt(i);
                String reversedString=new StringBuilder(temp).reverse().toString();
                res+=reversedString;
                res+=" ";
                temp="";
            }else if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
            }else if(s.charAt(i+1)!=' '){
                String reversedString=new StringBuilder(temp).reverse().toString();
                res+=reversedString;
                res+=" ";   
                temp="";            
            }
        }
        //removing trailing spaces
        while(res.length()>0 && res.charAt(res.length()-1)==' '){
            res=res.substring(0,res.length()-1);
        }
        return res;
        //return res.trim();
    }
}
