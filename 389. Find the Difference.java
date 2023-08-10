class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '\0';
    }
}