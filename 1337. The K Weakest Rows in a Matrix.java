class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] counts = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += mat[i][j];
            }
            counts[i] = new int[]{count, i};
        }
        
        Arrays.sort(counts, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = counts[i][1];
        }
        
        return result;       
    }
}