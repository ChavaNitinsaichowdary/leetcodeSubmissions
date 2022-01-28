class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = new int[2];
       ans[0]=searchIndex(nums,target,true);
       if(ans[0]!=-1){
           ans[1]=searchIndex(nums,target,false);
       }
        else{
            ans[1]=-1;
        }
        return ans;
    }
    public int searchIndex(int[] nums,int target,boolean firstIndex){
        int s = 0;
        int e = nums.length-1;
        int ans=-1;
        while(e>=s){
            int m = s+(e-s)/2;
            if(target>nums[m]){
                s=m+1;
            }
            if(target<nums[m]){
                e=m-1;
            }
            if(target==nums[m]){
                ans=m;
                if(firstIndex){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        return ans;
    }
}