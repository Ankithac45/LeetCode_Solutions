class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int x = i, y = 0;
            int value = matrix[x][y];
            while (x < m && y < n) {
                if (matrix[x][y] != value) {
                    return false;
                }
                x++;
                y++;
            }
        }

        for (int j = 1; j < n; j++) {
            int x = 0, y = j;
            int value = matrix[x][y];
            while (x < m && y < n) {
                if (matrix[x][y] != value) {
                    return false;
                }
                x++;
                y++;
            }
        }

        return true;        
    }
}