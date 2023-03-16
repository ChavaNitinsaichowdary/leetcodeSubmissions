class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int[] ng = new int[nums2.length];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i= 0;i<nums2.length;i++){
            h.put(nums2[i],i);
        }
        Stack<Integer> s = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            if(s.isEmpty()){
                ng[i] = -1;
            }
            else if(s.size()>0&&s.peek()>nums2[i]){
                ng[i] = s.peek();
            }
            else if(s.size()>0&&s.peek()<=nums2[i]){
                while(!s.isEmpty()&&s.peek()<nums2[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ng[i] = -1;
                }
                else{
                    ng[i] = s.peek();
                }
            }
            s.push(nums2[i]);
        }
        for(int i : ng){
            System.out.print(i);
        }
        for(int i = 0;i<nums1.length;i++){
            if(h.containsKey(nums1[i])){
                ans[i] = ng[h.get(nums1[i])];
            }
        }
        return ans;
    }
}