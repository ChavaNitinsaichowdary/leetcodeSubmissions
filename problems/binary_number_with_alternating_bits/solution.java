class Solution {
    public boolean hasAlternatingBits(int n) {
        if( ( ( n = n ^ ( n >> 2 ) ) & n - 1 ) == 0 )
        {
            return true ;
        }
        return false;
    }
}