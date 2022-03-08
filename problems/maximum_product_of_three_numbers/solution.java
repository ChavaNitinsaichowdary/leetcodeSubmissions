class Solution {
    public int maximumProduct(int[] nums) {
      int max1 = Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE;
      int max3 = Integer.MIN_VALUE;
      int min1 = Integer.MAX_VALUE;
      int min2 = Integer.MAX_VALUE;
      for(int n:nums){
          if(n>max1){
              max3 = max2;
              max2 = max1;
              max1 = n;
          }
          else if(n>max2){
              max3 = max2;
              max2 = n;
          }
          else if(n>max3){
              max3  = n;
          }
      }
      for(int m:nums){
          if(m<min1){
              min2 = min1;
              min1 = m;
          }
          else if(m<min2){
              min2 = m;
          }
      }
        return Math.max((max3*max2*max1),(max1*min2*min1));
    }
}