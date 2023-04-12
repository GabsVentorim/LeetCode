class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j ++) {
                if(grid[i][j] == '1') {
                    count++;
                    solve(grid, i, j);
                }
            }
        }
        return count;
    }

    public void solve(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return; 
        grid[i][j] = '0';
        solve(grid, i + 1, j); // up
        solve(grid, i - 1, j); // down
        solve(grid, i, j + 1); // right
        solve(grid, i, j - 1); // left
    }
}