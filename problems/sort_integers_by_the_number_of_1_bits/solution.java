class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int[] bits = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
         bits[i] = noOf1s(arr[i]);
        }
        int l = 0;
        int length = 0;
        for(int i = 0;i<=14;i++){
            for(int j = 0;j<arr.length;j++){
               if(bits[j]==i){
                   ans[l] = arr[j];
                   l++;
               } 
            }
        }
     return ans;
     
     
       
    }
    public int noOf1s(int n){
        int cnt = 0;
        while(n!=0){
         if((n&1)==1){
             cnt++;
         }
            n=n>>1;
        }
        return cnt;
    }
    
}