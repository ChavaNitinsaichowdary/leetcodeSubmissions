class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] ans = new int[k];
        for(int i : nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        List<Integer>[] arr = new List[nums.length+1];
       
        for(Integer key : h.keySet()){
            if(arr[h.get(key)]==null) arr[h.get(key)]=new ArrayList<>();
            arr[h.get(key)].add(key);
        }
        int ind = 0;
        for(int i = nums.length;i>=0&&ind<k;i--){
            if(arr[i]!=null){
                for(int j = 0;j<arr[i].size()&&ind<k;j++){
                    ans[ind] = arr[i].get(j);
                    ind++;
                }
            }
        }
        return ans;
        
    }
}