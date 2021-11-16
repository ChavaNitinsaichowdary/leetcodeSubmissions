class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int n=0;
        for(int i =0;i<nums.length;i++){
           n=n+temp[nums[i]];
           temp[nums[i]]++;
        }
        return n;
        
    }
}