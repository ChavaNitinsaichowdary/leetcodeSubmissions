class Solution {
    public int characterReplacement(String s, int k) {
        if(k>=s.length()){
            return s.length();
        }
        Map<Character,Integer> m = new HashMap<>();
        int end = 0;
        int begin = 0;
        int counter = 0;
        int len = 0;
        while(end<s.length()){
            char ch = s.charAt(end);
            m.put(ch,m.getOrDefault(ch,0)+1);
            if(counter<m.get(ch)){
                counter=m.get(ch);
            }
            end++;
            while(end-begin-counter>k){
                char temp = s.charAt(begin);
                m.put(temp,m.get(temp)-1);
                counter = getMax(m);
                begin++;
            }
            len = Math.max(len,end-begin);
            
        }
        return len;
    }
    public int getMax(Map<Character,Integer> m){
        int max = 0;
        for(int x : m.values()){
            max = Math.max(max,x);
        }
        return max;
    }
}