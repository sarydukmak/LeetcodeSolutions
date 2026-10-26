class Solution {
    public static int countIslands(int[][] grid, int k) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    if (dfs(grid, i, j) % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static long dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length)
            return 0;
        if (grid[i][j] <= 0)
            return 0;
        long value = grid[i][j];
        grid[i][j] = 0;
        long up = dfs(grid, i - 1, j);
        long down = dfs(grid, i + 1, j);
        long right = dfs(grid, i, j + 1);
        long left = dfs(grid, i, j - 1);
        return value + up + down + right + left;
    }
}