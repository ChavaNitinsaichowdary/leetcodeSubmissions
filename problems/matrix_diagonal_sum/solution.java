class Solution {
    public int diagonalSum(int[][] mat) {
       int sum = 0;
       int i=0;
       while(i<mat.length){
           sum+=mat[i][i]+mat[i][mat.length-i-1];
           i++;
       }
       if(mat.length%2==0){
           return sum;
       }
       return (sum-(mat[mat.length/2][mat.length/2]));
    }
}