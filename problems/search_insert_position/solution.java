class Solution {
    public int searchInsert(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        if(target>nums[e]){
            return e+1;
        }
        if(target<nums[s]){
            return s;
        }
        while(e>=s){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
            if(s>e){
                return (e+1);
            }
            
        }
        return -1;
    }
}