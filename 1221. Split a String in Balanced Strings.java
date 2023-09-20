class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else if (c == 'R') {
                balance--;
            }
            
            if (balance == 0) {
                count++;
            }
        }
        
        return count;       
    }
}