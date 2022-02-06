class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int count= 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(rev(s.substring(count,i))).append(" ");
                count = i+1;
            }
        }
        sb.append(rev(s.substring(count)));
        return sb.toString();
    }
    public String rev(String str){
        String nstr="";
        char ch;
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      return nstr;
    }
}