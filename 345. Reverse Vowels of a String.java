class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                // Swap vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else {
                // Move the pointers if either character is not a vowel
                if (!isVowel(chars[left])) {
                    left++;
                }
                if (!isVowel(chars[right])) {
                    right--;
                }
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}