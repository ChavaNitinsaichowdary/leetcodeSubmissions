class Solution {
    public int binaryGap(int n) {
     int max = 0;
     int eachcount = 0;
     int count = 0;
     while(n!=0){
         if(count>=1) eachcount++;
         if((n&1)==1){
             if(count<2){
                 count++;
             }
         }
         if(count==2){
             max = Math.max(max,eachcount);
             eachcount = 0;
             count = 1;
         }
         n=n>>1;
     }
        return max;
    }
}