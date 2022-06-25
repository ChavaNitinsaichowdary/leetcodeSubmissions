class Solution {
    public int characterReplacement(String s, int k) {
        if(k>=s.length()){
            return s.length();
        }
        int end = 0;
        int begin = 0;
        int counter = 0;
        int len = 0;
        Map<Character,Integer> m = new HashMap<>();
        while(end<s.length()){
            char ch = s.charAt(end);
            m.put(ch,m.getOrDefault(ch,0)+1);
            if(m.get(ch)>counter){
                counter=m.get(ch);
            }
            end++;
            while(end-begin-counter>k){
                char temp=s.charAt(begin);
                m.put(temp,m.get(temp)-1);
                begin++;
            }
            len = Math.max(len,end-begin);
            
        }
        return len;
        
    }
    public int getMax(Map<Character,Integer> m){
        int max = 0;
        for(int x : m.values()){
            max=Math.max(x,max);
        }
        return max;
    }
}