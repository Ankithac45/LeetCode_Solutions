class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Boolean> usedChars = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (!charMap.containsKey(c1)) {
                if (usedChars.containsKey(c2)) {
                    return false;
                }
                
                charMap.put(c1, c2);
                usedChars.put(c2, true);
            } else {
                if (charMap.get(c1) != c2) {
                    return false;
                }
            }
        }
        
        return true;
    }
}