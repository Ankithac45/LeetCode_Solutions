class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                late++;
                if (late >= 3) {
                    return false;
                }
            } else if (c == 'A') {
                absent++;
                if (absent >= 2) {
                    return false;
                }
                late = 0;
            } else {
                late = 0;
            }
        }
        
        return true;
    }
}