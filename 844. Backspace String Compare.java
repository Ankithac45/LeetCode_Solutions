class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!t1.isEmpty()) {
                    t1.pop();
                }
            } else {
                t1.push(c);
            }
        }

        return s1.equals(t1);        
    }
}