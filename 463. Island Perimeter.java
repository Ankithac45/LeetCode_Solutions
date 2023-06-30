class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count += 4; // Count the four sides initially

                    // Check if neighboring cells are land
                    if (i > 0 && grid[i - 1][j] == 1) {
                        count -= 2; // Subtract 2 for the shared side
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        count -= 2; // Subtract 2 for the shared side
                    }
                }
            }
        }
        return count;
    }
}