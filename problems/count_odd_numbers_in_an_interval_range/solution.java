class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        int count = high-low+1;
        int t = high-low;
        if((high%2)==0&&low%2==0){
            ans = t/2;
        }
        else  ans = (t/2)+1;
        return ans;
    }
}