class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s =0;
        int e =1;
        while(e<nums.length-1){
            if(e<nums.length-1&&nums[s]==nums[e]){
                s=s+2;
                e=e+2;
            }
            if(e<nums.length-1&&nums[s]!=nums[e]){
                return nums[s];
            }
        }
        return nums[nums.length-1];
    }
}