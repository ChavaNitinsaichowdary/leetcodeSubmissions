class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length<=1){
            return fruits.length;
        }
        int end = 0;
        int begin = 0;
        int counter = 0;
        int len = 0;
        Map<Integer,Integer> m= new HashMap<>();
        while(end<fruits.length){
            int e = fruits[end];
            m.put(e,m.getOrDefault(e,0)+1);
            end++;
            while(m.size()>2){
                int s = fruits[begin];
                m.put(s,m.get(s)-1);
                if(m.get(s)==0){
                    m.remove(fruits[begin]);
                }
                begin++;
            }
            len = Math.max(len,end-begin);
            
        }
        return len;
    }
}
