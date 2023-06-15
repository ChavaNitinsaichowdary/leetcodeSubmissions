class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}