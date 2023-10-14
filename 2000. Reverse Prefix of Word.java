public class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return word;
        char[] wordArray = word.toCharArray();
        for (int i = 0; i <= index / 2; i++) {
            char c = wordArray[i];
            wordArray[i] = wordArray[index - i];
            wordArray[index - i] = c;
        }
        return new String(wordArray);
    }
}
