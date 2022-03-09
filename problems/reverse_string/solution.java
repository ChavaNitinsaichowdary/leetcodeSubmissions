class Solution {
    public void reverseString(char[] s) {
         s = helper(s,0,s.length-1);
    }
    public static char[] helper(char[] s,int f,int e){
        if(f>e){
            return s;
        }
        char temp = s[f];
        s[f] = s[e];
        s[e] = temp;
        return helper(s,f+1,e-1);
    }
}