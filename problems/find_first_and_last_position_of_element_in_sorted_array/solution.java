class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
     arr[0]= search(nums,target,true);
        if(arr[0]!=-1){
          arr[1] = search(nums,target,false);
        }
        else return new int[]{-1,-1};
        return arr;
    }
    public int search(int[] nums,int target,boolean firstIndex){
        int s =0;
        int e =nums.length-1;
        int ans = -1;
        while(e>=s){
            int m = s+(e-s)/2;
            if(target>nums[m]){
                s=m+1;
            }
            else if(target<nums[m]){
                e=m-1;
            }
            else{
                ans = m;
                if(firstIndex){
                    e=m-1;
                }
                else s=m+1;
            }   
        }
        return ans;
    }
}