class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int mid = 0;
        int hi = nums.length-1;
        int temp=0;
        while(mid<=hi){
            switch(nums[mid]){
                case 0:{
                    temp = nums[mid];
                    nums[mid]=nums[lo];
                    nums[lo]=temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = nums[mid];
                    nums[mid]=nums[hi];
                    nums[hi]=temp;
                    hi--;
                    break;
                }
            }
        }
    }
}