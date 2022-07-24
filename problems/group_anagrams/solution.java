class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null||strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> h = new HashMap<>();
        for(String s: strs){
            char[] arr = new char[26];
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
            }
            String keyStr = String.valueOf(arr);
            if(!h.containsKey(keyStr)){
                h.put(keyStr,new ArrayList<>());
            }
            h.get(keyStr).add(s);
        }
        return new ArrayList<>(h.values());
        
    }
    
    
    
    
    
    
}