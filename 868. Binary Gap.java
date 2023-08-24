class Solution {
    public int binaryGap(int n) {
        int maxlen = 0;
        int len = 0;
        boolean foundOne = false; 

        while (n > 0) {
            int val = n & 1;
            n >>= 1;

            if (val == 1) {
                if (foundOne) {
                    maxlen = Math.max(maxlen, len); 
                }
                len = 1; 
                foundOne = true; 
            } else if (foundOne) {
                len++;
            }
        }

        return maxlen;
    }
}