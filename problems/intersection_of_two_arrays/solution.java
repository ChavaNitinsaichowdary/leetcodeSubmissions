class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
    Arrays.sort(nums2);
    for(Integer elem : nums1){

        if (bs(elem,nums2)){
            hashSet.add(elem);
        }
    }
    int i=0;
    int temp[] = new int[hashSet.size()];
    for (Integer itr : hashSet){
        temp[i] = itr;

        i++;
    }
    return temp;
}

private static boolean bs(Integer elem, int[] arr) {
    //binary search
    int start =0;
    int end =arr.length-1;
    while (start<=end){
        int mid = (start+end)/2;
        if (arr[mid]==elem)
        {
            return true;
        }
        else if (elem > arr[mid]){
            start = mid+1;
        }
        else {
            end = mid-1;
        }
    }
    return false;
}
}
        
    
