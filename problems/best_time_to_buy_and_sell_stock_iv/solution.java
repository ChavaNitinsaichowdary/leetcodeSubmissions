class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length<=1) return 0;
        int cap = k;
        int buy = 1;
        int n = prices.length;
        int[][][] dp = new int[n][k+1][2];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                for(int l = 0;l<dp[0][0].length;l++){
                    dp[i][j][l] = -1;
                }
            }
        }
        return profit(prices,0,k,1,dp);
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