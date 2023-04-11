class Solution {
    public String removeStars(String s) {
        String neww="";
        int n=s.length()-1;
        int count=0;
        for(int i=n;i>=0;i--){
            if(count>0 && s.charAt(i)!='*'){
                count--;
            }else if(s.charAt(i)!='*'){
                neww+=s.charAt(i);
            }else{
                count++;
            }
        }
        StringBuilder newww = new StringBuilder(neww).reverse();
        return newww.toString();
    }
}