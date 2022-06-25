class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if(s.equals(t)){
            return s.length();
        }
        int end = 0;
        int begin = 0;
        int counter = 0;
        int len = 0;
        while(end<s.length()){
            counter+=Math.abs(s.charAt(end)-t.charAt(end));
            end++;
            while(counter>maxCost){
                counter-=Math.abs(s.charAt(begin)-t.charAt(begin));
                begin++;
            }
            len = Math.max(len,end-begin);
        }
        return len;
    }
}