class Solution {
    public boolean isValid(char[][] board,int i1,int j1){
        HashSet<Character> h = new HashSet<>();
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(board[i+i1][j+j1]!='.'){
                    if(h.contains(board[i+i1][j+j1])) return false;
                    h.add(board[i+i1][j+j1]);
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        //rows
        
        for(int i = 0;i<board.length;i++){
            int count = 0;
            HashSet<Character> h = new HashSet<>();
            for(int j = 0;j<board.length;j++){
                    if(board[i][j]!='.'){
                        count++;
                        h.add(board[i][j]);
                    }
            }
            if(count!=h.size()) return false;
        }
        for(int i = 0;i<board.length;i++){
            int count = 0;
            HashSet<Character> h = new HashSet<>();
            for(int j = 0;j<board.length;j++){
                    if(board[j][i]!='.'){
                        count++;
                        h.add(board[j][i]);
                    }
            }
            if(count!=h.size()) return false;
        }
        for(int k=0;k<9;k+=3){
            for(int l = 0;l<9;l+=3){
                if(!isValid(board,k,l)) return false;
            }
          }
        
        
        return true;
    }
}