class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE,closest_num = 0;
        for(int i = 0;i<nums.length;i++){
            if(min>Math.abs(nums[i])){
                min = Math.abs(nums[i]);
                closest_num = nums[i];
            }
            else if(min==Math.abs(nums[i])&&closest_num<nums[i]){
                closest_num = nums[i];
            }
        }
        return closest_num;
        
    }
   
}