class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(i<s.length()-2&&s.charAt(i+2)=='#'){
                sb.append((char)((Integer.valueOf(s.substring(i,i+2)))+96));
                i=i+2;
            }
            else{
                sb.append((char)(s.charAt(i)+48));
            }
            
        }
        return sb.toString();
    }
}