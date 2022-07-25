class DSU{
    int[] parent;
    int[] height;
    DSU(int n){
        parent = new int[n];
        height = new int[n];
        Arrays.fill(parent,-1);
        Arrays.fill(height,-1);
    }
    public int findRoot(int node){
        if(parent[node]==-1){
            return node;
        }
        return parent[node] = findRoot(parent[node]);
    }
    public boolean union(int node1,int node2){
        int ra = findRoot(node1);
        int rb = findRoot(node2);
        if(ra!=rb){
            if(height[ra]<height[rb]){
                parent[ra] = rb;
            }
            else if(height[ra]>height[rb]){
                parent[rb] = ra;
            }
            else{
                parent[ra] = rb;
                height[rb]++;
            }
            return true;
        }
        return false;
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int discarded = 0;
        DSU dsu = new DSU(n);
        for(int[] connection:connections){
            if(!dsu.union(connection[0],connection[1])){
                discarded++;
            }
        }
        int comp = 0;
        for(int a : dsu.parent){
            if(a==-1){
                comp++;
            }
        }
        int edgeReq = comp-1;
        if(discarded<edgeReq){
            return -1;
        }
        return edgeReq;
    }
}