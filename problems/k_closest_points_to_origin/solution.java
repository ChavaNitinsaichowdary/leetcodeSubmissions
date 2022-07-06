class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((p1,p2)->p2[0]*p2[0]+p2[1]*p2[1]-p1[0]*p1[0]-p1[1]*p1[1]);
        for(int[] num : points){
            p.add(num);
            if(p.size()>k){
                p.poll();
            }
        }
        int[][] ans = new int[k][2];
        while(k>0){
            ans[--k] = p.poll();
        }
        return ans;
        
    }
    
}