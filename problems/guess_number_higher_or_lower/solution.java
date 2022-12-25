/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return helper(1,n);
    }
    public int helper(int start,int end){
        if(start == end) return start;
        int mid = Math.toIntExact(((long)start+(long)end)/2);
        int r = 0;
        if(guess(mid) == 0) r = mid;
        else if(guess(mid) == 1) r = helper(mid+1, end);
        else if(guess(mid) == -1) r = helper(start, mid-1);
        return r;
    }
}