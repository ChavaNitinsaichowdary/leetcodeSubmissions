class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<board.length;i++){
            if(board[i][0]=='O'){
                board[i][0]='t';
                q.add(new int[]{i,0});
            }
            if(board[i][board[0].length-1]=='O'){
                board[i][board[0].length-1]='t';
                q.add(new int[]{i,n-1});
            }
        }
        for(int i = 0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                board[0][i]='t';
                q.add(new int[]{0,i});
            }
            if(board[board.length-1][i]=='O'){
                board[board.length-1][i]='t';
                q.add(new int[]{m-1,i});
            }
        }

        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = new int[2];
            curr = q.poll();
            int currR = curr[0];
            int currC = curr[1];
            for(int i = 0;i<dir.length;i++){
                int nextR = currR+dir[i][0];
                int nextC = currC+dir[i][1];
                if(nextR<board.length&&nextR>=0&&nextC<board[0].length&&nextC>=0){
                    if(board[nextR][nextC]=='O'){
                      q.add(new int[]{nextR,nextC});
                      board[nextR][nextC]='t';
                    }
                }
                
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='t'){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
            }
        }
    }
}