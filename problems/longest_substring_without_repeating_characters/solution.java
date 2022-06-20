class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        Map<Character,Integer> m = new HashMap<>();
        
        int end = 0;
        int begin = 0;
        int counter = 0;
        int d = 0;
        while(end<s.length()){
            char c = s.charAt(end);
            m.put(c,m.getOrDefault(c,0)+1);
            if(m.get(c)>1){
                counter++;
            }
            end++;
            while(counter>0){
                char temp = s.charAt(begin);
                if(m.get(temp)>1) counter--;
                m.put(temp,m.get(temp)-1);
                begin++;
            }
            d = Math.max(d,end-begin);
        }
        return d;
        
    }
}