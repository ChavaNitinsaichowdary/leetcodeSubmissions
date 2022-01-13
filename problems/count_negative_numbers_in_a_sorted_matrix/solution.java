class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        int s = 0;
        int c = grid[0].length-1;
        while(s<grid.length&&c>=0){
            if(grid[s][c]<0){
                ans = ans+grid.length-s;
                c--;
            }
            else s++;
        }
        return ans;
    }
}