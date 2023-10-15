class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];
        int[] trustedByCount = new int[n + 1];
        
        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            trustCount[a]++;
            trustedByCount[b]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == 0 && trustedByCount[i] == n - 1) {
                return i; 
            }
        }
        
        return -1;    
    }
}