class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n){
            return false;
        }
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i = 0;i<m;i++){
            char c = s1.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int counter = h.size();
        int end = 0;
        int begin = 0;
        while(end<n){
            char ch = s2.charAt(end);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)-1);
                if(h.get(ch)==0){
                    counter--;
                }
            }
            end++;
            while(counter==0){
                if(end-begin==s1.length()){
                    return true;
                }
                char temp = s2.charAt(begin);
                if(h.containsKey(temp)){
                    h.put(temp,h.get(temp)+1);
                    if(h.get(temp)==1){
                        counter++;
                    }
                }
                begin++;
                
            }
        }
        return false;
        
    }
}