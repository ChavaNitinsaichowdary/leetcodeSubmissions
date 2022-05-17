class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int eq = sum/3;
        sum = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(count==2){
            return true;
        }
            sum+=arr[i];
            if(sum==eq){
                count++;
                sum = 0;
            }
        }
        
        return false;
        
    }
}