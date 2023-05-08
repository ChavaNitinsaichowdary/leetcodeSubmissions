class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> h = new HashMap<>();
        int len = s.length();
        for(int i = 0;i<len;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<len;i++){
            if(!h.containsKey(t.charAt(i))){
                return false;
            }
            else{
                if(h.get(t.charAt(i))==0) return false;
                h.put(t.charAt(i),h.get(t.charAt(i))-1);
            }
        }
        return true;

    }
}