class Solution {
    public int findPeakElement(int[] nums) {
       int start = 0;
       int end = nums.length-1;
       while(end>start){
           int m = start+(end-start)/2;
           if(nums[m]>nums[m+1]){
               end = m;
           }
           else start = m+1;
       }
       return start;
    }
}