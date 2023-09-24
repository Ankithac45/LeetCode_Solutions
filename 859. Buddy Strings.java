class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if (n != m) {
            return false;
        }

        if (s.equals(goal)) {
            HashSet<Character> seen = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (seen.contains(c)) {
                    return true;
                }
                seen.add(c);
            }
            return false;
        }

        int[] diffIndices = new int[2];
        int diffCount = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diffCount == 2) {
                    return false; // More than two differences, not possible to swap
                }
                diffIndices[diffCount++] = i;
            }
        }

        return diffCount == 2 && s.charAt(diffIndices[0]) == goal.charAt(diffIndices[1]) && s.charAt(diffIndices[1]) == goal.charAt(diffIndices[0]);       
    }
}