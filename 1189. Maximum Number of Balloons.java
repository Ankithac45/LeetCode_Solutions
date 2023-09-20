class Solution {
    public int maxNumberOfBalloons(String text) {
        int b_count = 0, a_count = 0, l_count = 0, o_count = 0, n_count = 0;
        
        for (char c : text.toCharArray()) {
            if (c == 'b') b_count++;
            else if (c == 'a') a_count++;
            else if (c == 'l') l_count++;
            else if (c == 'o') o_count++;
            else if (c == 'n') n_count++;
        }
        
        int max_instances = Math.min(Math.min(Math.min(Math.min(b_count, a_count), n_count), l_count / 2), o_count / 2);
        
        return max_instances;       
    }
}