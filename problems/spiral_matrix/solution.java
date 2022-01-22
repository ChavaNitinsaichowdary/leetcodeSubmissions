class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        int t = 0;
        int b = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;
        int dir = 0;
        while(t<=b&&l<=r){
            if(dir==0){
                for(int i = l;i<=r;i++){
                    ans.add(matrix[t][i]);
                }
                t++;
            }
            else if(dir==1){
                   for(int i = t;i<=b;i++){
                      ans.add(matrix[i][r]);
                   }
                   r--;
            }
            else if(dir==2){
                for(int i = r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
                b--;
            }
            else if(dir==3){
                for(int i = b;i>=t;i--){
                    ans.add(matrix[i][l]);
                }
                l++;
            }
            dir = (dir+1)%4;
        }
        return ans;
        
    }
}