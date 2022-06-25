class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int end = 0;
        int begin = 0;
        int counter = 0;
        int len = Integer.MAX_VALUE;
        while(end<nums.length){
            counter+=nums[end++];
            while(counter>=target){
                len = Math.min(len,end-begin);
                counter-=nums[begin++];
            }
        }
        if(len==Integer.MAX_VALUE){
            return 0;
        }
        return len;
    }
}