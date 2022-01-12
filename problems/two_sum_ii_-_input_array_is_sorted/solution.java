class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        while(e>=s){
            if(numbers[s]+numbers[e]==target){
              return new int[]{s+1,e+1};  
            }
            
            if(numbers[s]+numbers[e]>target){
                e =e-1;
            }
            else 
            {
                s = s+1;
            }
        }
        return new int[]{-1,-1};
               
        
        
    }
}