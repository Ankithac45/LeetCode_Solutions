class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int res = 0;
        while(n>0){
            // Check if multiplying by 10 would cause overflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && n % 10 > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            res = res*10 + n%10;
            n = n/10; 
        }
        if(x<0){
            return -res;
        }
        return res;
    }
}