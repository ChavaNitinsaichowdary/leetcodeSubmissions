class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            List<String> lis = new ArrayList<>();
            return lis;
        }
        return pad("",digits);
    }
    public List<String> pad(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        if(digit==7){
            for(int i = 15;i<=18;i++){
                 char ch = (char)('a'+i);
                 ans.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else if(digit==9){
            for(int i = 22;i<=25;i++){
                 char ch = (char)('a'+i);
                 ans.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else if(digit==8){
            for(int i = 19;i<=21;i++){
                 char ch = (char)('a'+i);
                 ans.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else{
          for(int i = (digit-2)*3;i<(digit-1)*3;i++){
            if(i==26){
                continue;
            }
            
            char ch = (char)('a'+i);
            ans.addAll(pad(p+ch,up.substring(1)));
         }  
        }
        
        
        return ans;
    }
}