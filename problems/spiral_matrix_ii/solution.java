class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        int dir = 0;
        int a = 1;
        while(b>=t&&r>=l){
            if(dir==0){
                for(int i= l;i<=r;i++){
                    ans[t][i] = a;
                    a++;
                }
                t++;
            }
            else if(dir==1){
                for(int i= t;i<=b;i++){
                    ans[i][r] = a;
                    a++;
                }
                r--;
            }
            else if(dir==2){
                 for(int i= r;i>=l;i--){
                    ans[b][i] = a;
                    a++;
                }
                b--;
            }
            else if(dir==3){
                for(int i= b;i>=t;i--){
                    ans[i][l] = a;
                    a++;
                }
                l++;
            }
            dir = (dir+1)%4;
        }
        return ans;
    }
}