class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int left = fun(nums,1,nums.length-1);
        int right = fun(nums,0,nums.length-2);
        return Math.max(left,right);
        
    }
    public int fun(int[] nums,int lo,int hi){
        int prev2 = 0;
        int prev =  0;
        for(int i = lo;i<=hi;i++){
            int pick = nums[i];
            if(i>1){
                pick+=prev2;
            }
            int unpick = prev;
            int curr = Math.max(pick,unpick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}