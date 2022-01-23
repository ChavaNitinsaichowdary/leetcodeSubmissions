class Solution {
    public int[] plusOne(int[] digits) {
        int idx = digits.length-1;
        while(idx>=0){
            if(digits[idx]==9){
                digits[idx]=0;
            }
            else{
                digits[idx]++;
                return digits;
            }
            idx--;
        }
        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}