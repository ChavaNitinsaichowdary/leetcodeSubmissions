class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        boolean ispowerof2 = ((n&(n-1))==0);
        boolean lastdigit = (n%10 == 4)||(n%10==6);
        return ispowerof2&lastdigit;
    }
}