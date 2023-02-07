class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j =0;
        while(i<fruits.length){
             h.put(fruits[i],h.getOrDefault(fruits[i],0)+1);
             while(h.size()>2){
                h.put(fruits[j],h.getOrDefault(fruits[j],0)-1);
                if(h.get(fruits[j])==0){
                    h.remove(fruits[j]);
                }
                j++;
             }
             ans = Math.max(ans,i-j+1);
             i++;
        }
        return ans;
    }
}