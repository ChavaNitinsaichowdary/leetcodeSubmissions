class Solution {
    public String reversePrefix(String word, char ch) {
        int id = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                id = i;
                break;
            }
        }
        for(int i = id; i>=0; i--){
            sb.append(word.charAt(i));
        }
        sb.append(word.substring(id+1, word.length()));
        return sb.toString();
    }
}