class Solution {
    public int arrangeCoins(int n) {
        long l =0;
        long h=n;
        while(l<=h){
            long m =(l+h)/2;
            long cur = m*(m+1)/2;
            if(cur==n){
                return (int)m;
            }else if(cur<n){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return (int)h;
    }
}