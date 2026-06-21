class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return;
        }

        if (visited[r][c] || grid[r][c] == '0') {
            return;
        }

        visited[r][c] = true;

        dfs(grid, r - 1, c, visited); 
        dfs(grid, r + 1, c, visited); 
        dfs(grid, r, c - 1, visited); 
        dfs(grid, r, c + 1, visited); 
    }
}