class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int ans = Integer.MIN_VALUE;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        System.out.print(q);
        if(q.isEmpty()||q.size()==n*n) return -1;
        int level = -1;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int sz = q.size();
            level++;
            while(sz-->0){
                    int[] curr_node = q.poll();
                    int currR =curr_node[0];
                    int currC = curr_node[1];
                    for(int i = 0;i<dir.length;i++){
                            int nextR = currR+dir[i][0];
                            int nextC = currC+dir[i][1];
                            if(nextR>=0&&nextC>=0&&nextR<n&&nextC<n&&grid[nextR][nextC]==0){
                                grid[nextR][nextC]=1;
                                q.add(new int[]{nextR,nextC});
                            }
                    }  
                     
            }
        }
        return level;

    }
}