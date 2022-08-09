class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 1;i<=n;i++) adj.add(new ArrayList<Integer>());
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(source,destination,adj,visited);
    }
    public boolean dfs(int source,int destination,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        if(source==destination) return true;
        if(visited[source]) return false;
        visited[source] = true;
        for(Integer it: adj.get(source)){
            if(!visited[it]){
                if(dfs(it,destination,adj,visited)) return true;
            }
        }
        return false;
    }
}