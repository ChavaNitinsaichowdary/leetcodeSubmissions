class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int island = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    island++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return island;
    }
    public void dfs(int i ,int j,boolean[][] visited,char[][] grid){
      if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1'||visited[i][j]){
          return;
      }
      visited[i][j] = true;
        dfs(i+1,j,visited,grid);
        dfs(i-1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i,j-1,visited,grid);
        
    }
}