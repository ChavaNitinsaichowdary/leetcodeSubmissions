class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int[] trusted = new int[n+1];
        for(int[] arr:trust){
            trusted[arr[0]]--;
            trusted[arr[1]]++;
        }
        for(int i=0;i<trusted.length;i++){
            if(trusted[i]==n-1) return i;
        }
        return -1;
    }
}