class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            if(i>0)nums[i] = nums[i]+ nums[i-1];
            int remainder = ((nums[i]%k)+k)%k; //handling negative values
            mp.put(remainder,mp.getOrDefault(remainder,0)+1);
        }
        int ans = mp.getOrDefault(0,0);
        for(int freq:mp.values()){
            ans+= freq*(freq-1)/2;
        }
        return ans;
    }
}