class Solution {
    public int maxProfit(int[] prices) {
        int cap = 2;
        int buy = 1;
        int n = prices.length;
        int[][][] dp = new int[n+1][3][2];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                for(int k = 0;k<dp[0][0].length;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return profit(prices,0,2,1,dp);
    }
    public int profit(int[] prices,int ind,int cap,int buy,int[][][] dp){
        if(cap==0) return 0;
        if(ind==prices.length) return 0;
        if(dp[ind][cap][buy]!=-1) return dp[ind][cap][buy];
        int profit = Integer.MIN_VALUE;
        if(buy==1){
            profit = Math.max(-prices[ind]+profit(prices,ind+1,cap,0,dp),profit(prices,ind+1,cap,1,dp));
        }
        else{
            profit = Math.max(prices[ind]+profit(prices,ind+1,cap-1,1,dp),profit(prices,ind+1,cap,0,dp));
        }
        dp[ind][cap][buy] = profit;
        return profit;
    }
    
}