class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            h.add(i);
        }
        int len = 0;
        int ans = 0;
        for(int k : nums){
            int l = k;
            len=1;
            while(h.contains(l-1)){
                len++;
                h.remove(l-1);
                l--;
            }
            l=k;
            while(h.contains(l+1)){
                len++;
                h.remove(l+1);
                l++;
            }
            ans = Math.max(ans,len);
        }
        return ans;
    }
}