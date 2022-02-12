class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left;i<=right;i++){
        if(isPrime(countsetBits(i))){
            ans++;
        } 
      }
        return ans;
    }
    public int countsetBits(int n){
        int count =0;
        while(n>0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n==2 || n==3|| n==5|| n==7|| n==11||n==13|| n==17|| n==19 || n==23)
        {
           return true;
        }
        return false;
    }
}