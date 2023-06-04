class Solution {
    public double myPow(double x, int n) {
        long absN = Math.abs((long) n);
        double result = 1.0;
        
        while (absN > 0) {
            if (absN % 2 == 1)
                result *= x;
            
            x *= x;
            absN /= 2;
        }
        
        return n < 0 ? 1 / result : result;
    }
}