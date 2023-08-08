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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        sum(root,"");
        return sum;
    }
    public  void sum(TreeNode root,String str){
        if(root==null){
           return;
        }
        str = str + root.val;
        if(root.left==null&&root.right==null){
            sum += Integer.valueOf(str);
        }
        sum(root.left,str);
        sum(root.right,str);

    }
}