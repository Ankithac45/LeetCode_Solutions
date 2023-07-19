class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}