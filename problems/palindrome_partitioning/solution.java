class Solution {
    public List<List<String>> partition(String s) {
        if(s.length()==0){
            return new ArrayList<>();
        }
        List<List<String>> ans = new ArrayList<>();
        helper(ans,new ArrayList<>(),s,0);
        return ans;
    }
    public void helper(List<List<String>> ans,List<String> tempList,String s,int start){
        if(start==s.length()){
             ans.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    tempList.add(s.substring(start,i+1));
                    helper(ans,tempList,s,i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }
    public boolean isPalindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}