class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            arr[i] = noOf1s(i);
        }
        return arr;
    }
    public int noOf1s(int num){
        int ans = 0;
        String str = new String(Integer.toBinaryString(num));
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
               ans++; 
            }
        }
        return ans;
    }
}