class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> allAddresses = new LinkedList<>();
        int[] path = new int[4];
        helper(allAddresses,path,s,0,0);
        return allAddresses;
    }
    public void helper(List<String> allAddresses,int[] path,String s,int start,int segment){
        if(segment==4&&start==s.length()){
            allAddresses.add(path[0]+"."+path[1]+"."+path[2]+"."+path[3]);
            return;
        }
        else if(segment==4||start==s.length()){
            return;
        }
        for(int len = 1;len<=3&&start+len<=s.length();len++){
            String t = s.substring(start,start+len);
            int num = Integer.parseInt(t);
            if(num>255||len>=2&&s.charAt(start)=='0'){
                break;
            }
            path[segment] = num;
            helper(allAddresses,path,s,start+len,segment+1);
            path[segment] = -1;
        }
    }
}
