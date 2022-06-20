class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()){
            return list; 
        }
        int begin = 0;
        int end = 0;
        Map<Character,Integer> m = new HashMap<>();
        for(char ch : p.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int counter = m.size();
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
                char temp = s.charAt(begin);
                if(m.containsKey(temp)){
                    m.put(temp,m.get(temp)+1);
                    if(m.get(temp)>0){
                        counter++;
                    }
                }
                if((end-begin)==p.length()){
                    list.add(begin);
                }
                
                begin++;
            }
        }
        return list;
    }
}