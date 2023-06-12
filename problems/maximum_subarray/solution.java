class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int meh = 0;
        for(int i = 0;i<nums.length;i++){
            meh = meh + nums[i];
            if(meh<nums[i]){
                meh = nums[i];
            }
            if(meh>ans){
                ans = meh;
            }
        }
        return ans;
    }
}