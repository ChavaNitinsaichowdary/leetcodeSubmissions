class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms.get(0),0,rooms,visited);
        for(int i = 0;i<visited.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<Integer> list,int i,List<List<Integer>> rooms,boolean[] visited){
        visited[i] = true;
        for(Integer it:list){
            if(!visited[it]){
                visited[it] = true;
                dfs(rooms.get(it),it,rooms,visited);
            }
        }
    }
}