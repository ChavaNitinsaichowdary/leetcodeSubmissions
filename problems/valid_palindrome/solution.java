class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder(str.length());
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if((c>96&&c<123)||(c>47&&c<58)){
                sb.append(c);
            }
        }
        if(sb==null||sb.length()==0){
            return true;
        }
        String str1 = sb.toString();
        for(int j = 0;j<=str1.length()/2;j++){
            char start = str1.charAt(j);
            char end = str1.charAt(str1.length()-j-1);
            if(start!=end){
                return false;
            }
        }
        return true;
        
    }
}