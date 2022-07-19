class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        l.add(nums[0]);
        int lastIndex = nums[0];
        for(int i = 1;i<n;i++){
            if(nums[i]>lastIndex){
                l.add(nums[i]);
                lastIndex = nums[i];
            }
            else{
               int index =  Collections.binarySearch(l,nums[i]);
               if(index<0){
                   index = -(index+1);
               }
               l.set(index,nums[i]);
               lastIndex = l.get(l.size()-1);
            }
        }
        return l.size();
         
    }
    
   
}