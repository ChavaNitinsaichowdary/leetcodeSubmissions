class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length-1;
        int carry = 0;
        while(i>=0||k>0){
            int curr = 0;
            int arr = 0;
            if(k>0){
                 curr = k%10;
            }
            if(i>=0){
                 arr = num[i];
            }
            
            int sum = curr+arr+carry;
            ans.add(sum%10);
            carry = sum/10;
            k=k/10;
            i--;
        }
        if(carry!=0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
}