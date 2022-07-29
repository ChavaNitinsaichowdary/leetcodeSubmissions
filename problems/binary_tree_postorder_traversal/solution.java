/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr!=null||s.size()>0){
            if(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode temp = s.peek().right;
                if(temp==null){
                     temp = s.peek();
                    list.add(temp.val);
                    s.pop();
                    while(!s.isEmpty()&&temp==s.peek().right){
                        temp = s.peek();
                        s.pop();
                        list.add(temp.val);
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        
        return list;
        
    }
}