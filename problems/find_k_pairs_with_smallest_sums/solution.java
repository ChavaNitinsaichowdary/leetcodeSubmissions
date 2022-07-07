class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
       PriorityQueue<int[]> p = new PriorityQueue<>((a1,a2)->a1[0]+a1[1]-a2[1]-a2[0]);
        List<List<Integer>> res = new ArrayList<>();
       if(nums1.length==0||nums2.length==0||k==0){
           return res;
       }
       
       for(int i = 0;i<nums1.length&&i<k;i++){
           p.offer(new int[]{nums1[i],nums2[0],0});
       }
       while(k-->0&&p.size()!=0){
           int[] curr = p.poll();
           List<Integer> s = new ArrayList<>();
           s.add(curr[0]);
           s.add(curr[1]);
           res.add(s);
           if(curr[2]==nums2.length-1) continue;
           p.offer(new int[]{curr[0],nums2[curr[2]+1],curr[2]+1});
           
       }
        return res;
       
    }
}