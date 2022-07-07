class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int m = matrix.length; 
        int n = matrix[0].length;
        for(int i = 0;i<Math.min(m,k);i++){
            p.offer(new int[]{matrix[i][0],i,0});
        }
        int ans = 0;
        for(int i = 1;i<=k;i++){
            int[] curr = p.poll();
            int r = curr[1],c=curr[2];
            ans = curr[0];
            if(c<n-1){
                p.offer(new int[]{matrix[r][c+1],r,c+1});
            } 
        }   
        return ans;
    }
}

