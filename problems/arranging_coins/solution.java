class Solution {
    public int arrangeCoins(int n) {
        long s =0;
        long e =n;
        while(e>=s){
            long m = s+(e-s)/2;
            if(m*(m+1)/2==n){
                return (int)m;
            }
            else if(m*(m+1)/2>n){
                e = m-1;
            }
            else {
                s=m+1;
            }
        }
        return (int)e;
        
    }
}