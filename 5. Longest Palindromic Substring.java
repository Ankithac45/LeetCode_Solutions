class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int len = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            String palindrome1 = expandAroundCenter(s, i, i);
            String palindrome2 = expandAroundCenter(s, i, i + 1);
            
            if (palindrome1.length() > len) {
                len = palindrome1.length();
                res = palindrome1;
            }
            
            if (palindrome2.length() > len) {
                len = palindrome2.length();
                res = palindrome2;
            }
        }
        
        return res;
    }
    
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}
