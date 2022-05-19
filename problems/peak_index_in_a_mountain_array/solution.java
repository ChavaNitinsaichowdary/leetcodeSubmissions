class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(e>s){
            int m = s+(e-s)/2;
            if(m<e&&arr[m+1]>arr[m]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return e;
    }
}