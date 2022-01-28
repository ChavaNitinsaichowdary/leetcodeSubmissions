class Solution {
    public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
       for(int i=0;i<arr.length-1;i++){
           int target = 2*arr[i];
           if(target == arr[i]){
               arr[i]=-1;
               int ans = BinarySearch(arr,target);
           }
           int ans = BinarySearch(arr,target);
           if(ans!=-1){
               return true;
           }
       }
        return false;
    }
    public int BinarySearch(int[] arr,int target){
        int s =0;
        int e =arr.length-1;
        while(e>=s){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(arr[m]>target){
                e=m-1;
            }
            else s=m+1;
        }
        return -1;
    }
}