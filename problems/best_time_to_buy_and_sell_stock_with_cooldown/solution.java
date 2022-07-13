class Solution {
    public int maxProfit(int[] nums) {
       int[][] dp = new int[nums.length][2];
       for(int[] num : dp){
           Arrays.fill(num,-1);
       }
       return profit(nums,0,1,dp);
        
    }
    public int profit(int[] nums,int ind,int buy,int[][] dp){
        if(ind>=nums.length) return 0;
        int gain = Integer.MIN_VALUE;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy==1){
            gain = Math.max(-nums[ind]+profit(nums,ind+1,0,dp),profit(nums,ind+1,1,dp));
        }
        else{
            gain = Math.max(nums[ind]+profit(nums,ind+2,1,dp),profit(nums,ind+1,0,dp));
        }
        dp[ind][buy] = gain;
        return gain;
    }
}