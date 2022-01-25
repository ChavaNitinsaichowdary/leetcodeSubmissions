class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
           if(check(mat,target)){
               return true;
           }
           else{
               rotate(mat);
           }
        }
        return false;
    }
    public void rotate(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int t = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]=t;
            }
        }
        int start = 0;
        int end = mat.length-1;
        while(start<=end){
            for(int i = 0;i<mat.length;i++){
                int t = mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=t;
            }
            start++;
            end--;
        }    
    }
    public boolean check(int[][] mat,int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]!=target[i][j]){
                   return false;
               }
            }
        }
        return true;
    }
}