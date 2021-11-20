class Solution {
    public int findNumbers(int[] nums) {
        int e=0;
        for(int i=0;i<nums.length;i++){
            // while(nums[i]>0){
              //  nums[i]/=10;
               // s[i]++;
            //}
            int s =(int)Math.log10(nums[i])+1;
            if(s%2==0){
                e++;
            }
        }
        return e;
        
        
    }
}