class Solution {
    public boolean judgeCircle(String moves) {
        int leftright = 0;
        int updown = 0;
        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                updown++;
            }
            if(moves.charAt(i)=='D'){
                updown--;
            }
            if(moves.charAt(i)=='L'){
                leftright--;
            }
            if(moves.charAt(i)=='R'){
                leftright++;
            }
        }
        if(updown==0&&leftright==0){
            return true;
        }
        return false;
    }
}