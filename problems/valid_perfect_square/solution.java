class Solution {
    public boolean isPerfectSquare(int num) {
        long s =1;
        long e =num;
        while(e>=s){
            long m = s+(e-s)/2;
            long square = (long)(m*m);
            if(square ==num){
                return true;
            }
            else if(num>square){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return false;
        
    }
}