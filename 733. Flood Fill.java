class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows = image.length;
        int cols = image[0].length;
        int originalColor = image[sr][sc];

        if (originalColor != color) {
            dfs(image, sr, sc, rows, cols, originalColor, color);
        }

        return image;
    }

    private void dfs(int[][] image, int row, int col, int rows, int cols, int originalColor, int newColor) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || image[row][col] != originalColor) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row - 1, col, rows, cols, originalColor, newColor);
        dfs(image, row + 1, col, rows, cols, originalColor, newColor);
        dfs(image, row, col - 1, rows, cols, originalColor, newColor);
        dfs(image, row, col + 1, rows, cols, originalColor, newColor);         
    }
}