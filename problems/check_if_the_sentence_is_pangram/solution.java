class Solution {
    public boolean checkIfPangram(String sentence) {
       int res=0;
        for(int i=0;i<sentence.length();i++){
            res|=(1<<(sentence.charAt(i))-1);
            if(res==((1<<26)-1)){
                return true;
            }
        }
        return false;
    }
}