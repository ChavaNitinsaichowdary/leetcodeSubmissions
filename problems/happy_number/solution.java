class Solution {
    public boolean isHappy(int n) {
        if(n==4){
            return false;
        }
        if(square(n)==1){
            return true;
        }
        return isHappy(square(n));
    }
    public int square(int n){
        int ans = 0;
        while(n>0){
            int a = n%10;
            ans+=Math.pow(a,2);
            n=n/10;
        }
        return ans;
    }
}