class Solution {
    public int longestOnes(int[] nums, int k) {
        if(k>=nums.length){
            return nums.length;
        }
        int counter = 0;
        int end = 0;
        int begin = 0;
        int len = 0;
        while(end<nums.length){
            if(nums[end]==0){
                counter++;
            }
            end++;
            while(counter>k){
                if(nums[begin]==0){
                    counter--;
                }
                begin++;
            }
            len = Math.max(len,end-begin);
        }
        return len;
        
    }
}