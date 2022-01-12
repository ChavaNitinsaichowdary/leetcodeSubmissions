class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s =0;
        int e = arr.length-1;
        if(k<arr[0]){
            return k;
        }
        while(e>=s){
            int m = s+(e-s)/2;
            if(arr[m]-m-1<k){
                s = m+1;
            }
            else e = m-1;
        }
        
        return (k+e+1);
    }
}