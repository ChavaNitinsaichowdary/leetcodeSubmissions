class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>(n);
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int t = nums[correct];
                nums[correct]=nums[i];
                nums[i]=t;
            }
            else{
                i++;
            }
        }
        for(int j =0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
        
    }
}