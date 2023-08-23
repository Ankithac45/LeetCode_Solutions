class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit = n & 1;
        n >>= 1;
        
        while (n > 0) {
            int currBit = n & 1;
            if (currBit == prevBit) {
                return false;
            }
            prevBit = currBit;
            n >>= 1;
        }
        
        return true;
    }
}