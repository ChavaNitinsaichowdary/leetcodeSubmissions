class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] hash = new int[n];
        Arrays.fill(dp,1);
        int ans = 1; // to get max among
        int lastIndex = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<n;i++){
            hash[i]=i;
            for(int prev = 0;prev<i;prev++){
               if(nums[i]%nums[prev]==0&&dp[i]<1+dp[prev]){
                   dp[i] = 1+dp[prev];
                   hash[i] = prev;
               }
            }
            if(dp[i]>ans){
                ans = dp[i];
                lastIndex = i;
            }
        }
        l.add(nums[lastIndex]);
        while(hash[lastIndex]!=lastIndex){
            lastIndex = hash[lastIndex];
            l.add(nums[lastIndex]);
        }
        Collections.reverse(l);
        return l;
        
        
    }
}