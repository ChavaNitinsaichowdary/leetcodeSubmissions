class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int t = nums[correct];
                nums[correct] = nums[i];
                nums[i]=t;
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int j =nums.length-1;j>=0;j--){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}