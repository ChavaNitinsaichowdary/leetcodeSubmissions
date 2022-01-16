class Solution {
    public int specialArray(int[] nums) {
       int x = 1;
       int count = 0;
    for( x = 1;x<=nums.length;x++){
       for(int i =0;i<nums.length;i++){
           if(nums[i]>=x){
               count++;
           }
         }
         if(count==x){
             return x;
             
         }
        count = 0;
    }
    return -1;
       
    }
}