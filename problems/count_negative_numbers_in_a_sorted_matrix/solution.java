
class Solution {
    public int countNegatives(int[][] grid) {
        int r = 0;
        int c = grid[0].length-1;
        int ans =0;
        while(r<grid.length && c>=0){
            int target = grid[r][c];
            if(target<0){
                ans=ans+grid.length-r;
                c--;
            }
            else if(target>-1){
                r++;
            }
            
        }
        return ans;
    }
}
