class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {

                if (grid[i][j] == 0) {
                    if (dfs(grid, i, j)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    private boolean dfs(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }

        if (grid[i][j] == 1) {
            return true;
        }

        grid[i][j] = 1;
        return dfs(grid, i - 1, j) & dfs(grid, i + 1, j) & dfs(grid, i, j - 1) & dfs(grid, i, j + 1);
    }
}