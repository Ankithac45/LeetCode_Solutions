class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isCapital = true;
        int capitalCount = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        if (capitalCount == 0 || capitalCount == word.length() || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)))) {
            return true;
        }

        return false;
    }
}