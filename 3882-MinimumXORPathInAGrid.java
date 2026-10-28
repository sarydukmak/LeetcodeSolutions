class Solution {
    int[][][] dp;
    int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n][1024];
        for (int[][] matrix : dp) {
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }
        }
        return Rec(grid, 0, 0, 0);
    }

    int Rec(int[][] grid, int row, int col, int xor) {
        int m = grid.length;
        int n = grid[0].length;
        if (row >= m || col >= n)
            return Integer.MAX_VALUE;
        xor ^= grid[row][col];
        if (row == m - 1 && col == n - 1)
            return xor;
        if (dp[row][col][xor] != -1)
            return dp[row][col][xor];
        return dp[row][col][xor] = Math.min(Rec(grid, row, col + 1, xor), Rec(grid, row + 1, col, xor));
    }
}
