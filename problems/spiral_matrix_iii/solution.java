class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int R = rows;
        int C = cols;
        int[][] res= new int[R*C][2];
         int r0 = rStart;
        int c0 = cStart;
        res[0]=new int[]{r0, c0};
        int len=0, idx=1, k=0;
        int[] d= new int[]{0,1,0,-1,0};
        while (idx<R*C){
            len++;
            for (int round=0; round<2; round++){
                for (int sz=len; sz>0; sz--){
                    r0+=d[k];
                    c0+=d[k+1];
                    if (r0<0 || r0>=R || c0<0 || c0>=C) continue;
                    res[idx++]=new int[]{r0, c0};
                }
                k=(k+1)%4;
            }
        }
        return res;
    }
}