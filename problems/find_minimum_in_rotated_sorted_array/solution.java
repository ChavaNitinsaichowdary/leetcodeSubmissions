class Solution {
    public int findMin(int[] nums) {
        int ans = pivotIndex(nums)+1;
        return nums[ans];
    }
    public int pivotIndex(int[] nums){
        int s =0;
        int e = nums.length-1;
        while(e>=s){
            int m = s+(e-s)/2;
            if(m<e&&nums[m]>nums[m+1]){
                return m;
            }
            if(m>s&&nums[m-1]>nums[m]){
                return m-1;
            }
            if(nums[m]>nums[s]){
                s=m+1;
            }
            else{
                e=m-1;
            }
            
        }
        return -1;
    }
}