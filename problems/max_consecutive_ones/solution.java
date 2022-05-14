class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int freq = 0;
        int i = 0;
        while(i<n){
            while(i<n&&nums[i]==1){
                freq++;
                i++;
            }
            ans = Math.max(ans,freq);
            freq=0;
            i++;
        }
        return ans;
    }
}