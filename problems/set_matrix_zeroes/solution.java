class Solution {
    public void setZeroes(int[][] matrix) {
       int[][] ans = new int[matrix.length][matrix[0].length];
         for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               ans[i][j]=matrix[i][j];
           }
       } 
       
       for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   zeroes(ans,i,j);
               }
           }
       }
       for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
              matrix[i][j]=ans[i][j];
           }
       } 
       
       
    }
    public void zeroes(int[][] ans,int c, int d){
        for(int a =0;a<ans.length;a++){
            ans[a][d]=0;
        }
         for(int a =0;a<ans[0].length;a++){
            ans[c][a]=0;
        }
    }
}