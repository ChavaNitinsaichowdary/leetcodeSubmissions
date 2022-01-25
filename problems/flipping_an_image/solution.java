class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            for(int i =0;i<n;i++){
                int t = image[i][start];
                image[i][start]=image[i][end]^1;
                image[i][end]=t^1;
            }
            start++;
            end--;
        }
        return image;
        
    }
}