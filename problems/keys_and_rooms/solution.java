class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        while(!st.isEmpty()){
            int curr_node = st.pop();
            for(Integer nextNode:rooms.get(curr_node)){
                if(!visited[nextNode]){
                    visited[nextNode]=true;
                    st.push(nextNode);
                }
            }
        }
        for(int i = 0;i<visited.length;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
}