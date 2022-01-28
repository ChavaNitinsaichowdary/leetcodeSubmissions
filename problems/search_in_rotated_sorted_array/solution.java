class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotIndex(nums);
        int ans = binarySearch(nums,0,pivot,target);
        if(ans==-1){
            ans = binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return ans;
    }
    public int pivotIndex(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
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
        return ans;
        
    }
    public int binarySearch(int[] nums,int s,int e,int target){
        while(e>=s){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[s]<nums[e]){
                if(target>nums[m]){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
            else{
                if(target>nums[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        return -1;
    }
}