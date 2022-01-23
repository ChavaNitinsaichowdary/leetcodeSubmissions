class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int pre = 1, k=1;
        for (int i=1; i<nums.length; ++i){
            if (nums[i] != nums[i-1]) {
                nums[pre] = nums[i];
                pre++;
                k++;
            }            
        }
        
        return k;
    }
}