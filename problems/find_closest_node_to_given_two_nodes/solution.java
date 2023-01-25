class Solution {
    public void shortestPath(int[] edges,int node, int[] distance){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int level = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-->0){
                int curr = q.poll();
                if(distance[curr]==-1){
                    distance[curr]=level;
                    if(edges[curr]!=-1){
                        q.add(edges[curr]);
                    }
                }
            }
            level++;
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] distance1 = new int[n];
        int[] distance2 = new int[n];
        Arrays.fill(distance1,-1);
        Arrays.fill(distance2,-1);
        shortestPath(edges,node1,distance1);
        shortestPath(edges,node2,distance2);
        int ans=  -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(distance1[i]!=-1&&distance2[i]!=-1){
                int dis = Integer.max(distance1[i],distance2[i]);
                if(dis<min){
                    ans = i;
                    min = dis;
                }
            }
        }
        return ans;
    }
    
}
