class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public int helper(int[] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[m]>target){
            return helper(nums,target,s,m-1);
        }
        return helper(nums,target,m+1,e);
        
    }
}