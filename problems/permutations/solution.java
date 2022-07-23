class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        backtrack(nums,list,tempList,h);
        return list;
    }
    public void backtrack(int[] nums,List<List<Integer>> list,List<Integer> tempList,HashSet<Integer> h){
        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }
        else{
            for(int i = 0;i<nums.length;i++){
                if(h.contains(nums[i])) continue;
                h.add(nums[i]);
                tempList.add(nums[i]);
                backtrack(nums,list,tempList,h);
                h.remove(tempList.get(tempList.size()-1));
                tempList.remove(tempList.size()-1);
                
            }
        }
    }
}