class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", 0, 0, n);
        return res;
    }

    private void generate(List<String> res, String s, int open, int close, int n) {
        if (open == n && close == n) {
            res.add(s);
            return;
        }

        if (open < n) {
            generate(res, s + '(', open + 1, close, n);
        }
        if (close < open) {
            generate(res, s + ')', open, close + 1, n);
        }       
    }
}