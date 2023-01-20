class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> findSubsequences(int[] nums) {
        res=new ArrayList<>();
        helper(new ArrayList<>(),nums,0);
        return res;
    }
    public void helper(List<Integer> list, int[] nums, int start){
        Set<Integer> set=new HashSet<>();
        if(start==nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(set.contains(nums[i])){
                    continue;
                }
            set.add(nums[i]);
            if(list.size()==0||nums[i]>=list.get(list.size()-1)){
                list.add(nums[i]);
                if(list.size()>1){
                    res.add(new ArrayList<>(list));
                }
                helper(list, nums, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}