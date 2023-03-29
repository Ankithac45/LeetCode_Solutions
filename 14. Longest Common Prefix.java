class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length=strs[0].length();
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<length){
                length=strs[i].length();
                str=strs[i];
            }
        }
        String res="";
        boolean flag=true;
        int index=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(index)!=str.charAt(index)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                res+=str.charAt(index);
            }
            index++;
        }
        return res;
    }
}