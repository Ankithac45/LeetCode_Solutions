class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        int sign = (dividend  0) ^ (divisor  0)  -1  1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        int quotient = 0;

        while (ldividend = ldivisor) {
            long temp = ldivisor;
            int multiple = 1;

            while (ldividend = (temp  1)) {
                temp = 1;
                multiple = 1;
            }

            ldividend -= temp;
            quotient += multiple;
        }

        return sign  quotient;
    }
}