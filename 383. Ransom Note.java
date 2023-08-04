class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        // Count characters in the magazine string
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check if ransomNote characters can be constructed from the magazine
        for (char ch : ransomNote.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
            map.put(ch, count - 1);
        }
        
        return true;
    }
}