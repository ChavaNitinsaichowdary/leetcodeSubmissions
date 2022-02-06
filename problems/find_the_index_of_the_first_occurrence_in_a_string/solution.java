class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle)==-1){
            return -1;
        }
        int firstIndex = 0;
        int lastIndex = needle.length()-1;
        while(lastIndex<haystack.length()){
            if(haystack.substring(firstIndex,lastIndex+1).equals(needle)){
                return firstIndex;
            }
            firstIndex++;
            lastIndex++;
        }
        return -1;
    }
}