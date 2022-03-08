class Solution {
    public boolean isPowerOfFour(int n) {
        int x = 0 ;
        return helper(n,x); 
    }
    public boolean helper(int n,int x){
        
        if(n==Math.pow(4,x)){
            return true;
        }
        if(n<Math.pow(4,x)){
            return false;
        }
        return helper(n,x+1);
        
    }
}