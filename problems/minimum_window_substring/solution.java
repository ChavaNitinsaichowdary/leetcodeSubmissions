class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> m = new HashMap<>();
        for(char ch : t.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int begin = 0;
        int end = 0;
        int counter = m.size();
        int len = Integer.MAX_VALUE;
        int head = 0;
        while(end<s.length()){
            char ch = s.charAt(end);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)-1);
                if(m.get(ch)==0){
                    counter--;
                }
            }
            end++;
            while(counter==0){
                if(end-begin<len){
                    len = end-begin;
                    head = begin;
                }
                char temp = s.charAt(begin);
                if(m.containsKey(temp)){
                    if(m.get(temp)==0){
                        counter++;
                    }
                    m.put(temp,m.get(temp)+1);
                    
                }
                
                begin++;
            }
            
        }
        if(len==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(head,head+len);
        
        
    }
}