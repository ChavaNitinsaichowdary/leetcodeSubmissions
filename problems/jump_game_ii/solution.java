class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j=1;j<=nums[i];j++){
                if(j+i<=n){
                    dp[j+i] = Math.min(dp[j+i],dp[i]+1);
                }
                
            }
        }
        return dp[n-1];

    }
}