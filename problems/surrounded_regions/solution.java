class Solution {
    public void solve(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1){
                   if(grid[i][j]=='O'){
                        q.add(i*n+j);
                        grid[i][j]='s';
                   } 
                }
            }
        }
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-->0){
                int currCell = q.poll();
                int r = currCell/n;
                int c = currCell%n;
                for(int k = 0;k<dir.length;k++){
                    int nr = r+dir[k][0];
                    int nc = c+dir[k][1];
                    if(nr>=0&&nc>=0&&nr<m&&nc<n&&grid[nr][nc]=='O'){
                        q.add(nr*n+nc);
                        grid[nr][nc]='s';
                    }
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]=='O'){
                    grid[i][j]='X';
                }
               else if(grid[i][j]=='s'){
                    grid[i][j]='O';
                }
            }
        }
        return;
        
    }
}