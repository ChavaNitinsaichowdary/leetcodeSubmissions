class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(end>start){
            int m = start+(end-start)/2;
            if(arr[m]>arr[m+1]){
                end = m;
            }
            else start = m+1;
        }
        return start;
    }
}