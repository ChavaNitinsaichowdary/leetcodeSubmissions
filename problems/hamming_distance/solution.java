class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int m = x^y;
        while(m!=0){
            if((m&1)==1){
                ans++;
            }
            m=m>>1;
        }
        return ans;
    }
}