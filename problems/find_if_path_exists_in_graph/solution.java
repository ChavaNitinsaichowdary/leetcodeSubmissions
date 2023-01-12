class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        if(source==destination) return true;
        for(int[] edge: edges){
              adj.get(edge[0]).add(edge[1]);
              adj.get(edge[1]).add(edge[0]);
        }
        
        
        boolean visited[] = new boolean[n];
        Stack<Integer> st = new Stack<>();
        st.push(source);
        visited[source]=true;
        while(!st.isEmpty()){
            int curr_node = st.pop();
            for(Integer nextNode:adj.get(curr_node)){
                if(!visited[nextNode]){
                    if(nextNode==destination){
                        return true;
                    }
                    st.push(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
        return false;
    }
}