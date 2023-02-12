class Solution {
    private long ans = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> l = new ArrayList<>();
        int n = roads.length+1;
        for(int i = 0;i<n;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int[] a : roads){
            l.get(a[0]).add(a[1]);
            l.get(a[1]).add(a[0]);
        }
        dfs(l,0,-1,seats);
        return ans;
    }
    public int dfs(List<List<Integer>> l,int curr,int prev,int seats){
        int people = 1;
        for(int i : l.get(curr)){
            if(i==prev) continue;
           people+=dfs(l,i,curr,seats);
        }
        if(curr>0)
            ans+=(people+seats-1)/seats;
        return people;

    }
    
    
    
}