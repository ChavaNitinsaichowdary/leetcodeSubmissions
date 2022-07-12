class Solution {
    static int[] dp = new int[31];
    public int fib(int n) {
      
      if(n<=1){
          return n;
      }
      if(dp[n]!=0){
          return dp[n];
      }
      int left = 0;
      if(dp[n-1]!=0){
          left = dp[n-1];
      }
      else{
          left = fib(n-1);
          dp[n-1] = left;
      }
      int right = 0;
      if(dp[n-2]!=0){
          right = dp[n-2];
      }
      else{
          right = fib(n-2);
          dp[n-2] = right;
      }
      dp[n] = left+right;
      return dp[n];
        
        
    }
}