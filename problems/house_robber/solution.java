class Solution {
    public int rob(int[] arr) {
         int prev = arr[0];
        int prev2 = 0;
        for(int i = 1;i<arr.length;i++){
            int pick = arr[i];
            if(i>1){
                pick+=prev2;
            }
            int unPick = prev;
            int curr = Math.max(pick,unPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
        
    }
}