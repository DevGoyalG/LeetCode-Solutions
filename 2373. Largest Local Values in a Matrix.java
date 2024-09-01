class Solution {
    private int helper(int[][] grid, int i, int j) {
        int maxi = Integer.MIN_VALUE;
        int r = i + 3, c = j + 3;
        for (int p = i; p < r; p++) {
            for (int q = j; q < c; q++) {
                maxi = Math.max(maxi, grid[p][q]);
            }
        }
        return maxi;
    }

    public int[][] largestLocal(int[][] grid) {
        int r = grid.length - 2;
        int c = grid[0].length - 2;

        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = helper(grid, i, j);
            }
        }
        return res;
    }
}
