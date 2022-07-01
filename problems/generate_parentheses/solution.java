class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n==0){
            return list;
        }
        String p = "";
        int op = n;
        int cl = n;
        solve(p,op,cl,list);
        return list;
        
    }
    public void solve(String p,int op,int cl,List<String> list){
        if(op==0&&cl==0){
            list.add(p);
            return;
        }
        if(op!=0){
            solve(p+"(",op-1,cl,list);
        }
        if(cl>op){
            solve(p+")",op,cl-1,list);
        }
        return;
    }
}