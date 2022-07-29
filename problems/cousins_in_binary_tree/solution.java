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
    int h1;
    int h2;
    TreeNode h1Parent;
    TreeNode h2Parent;
    public boolean isCousins(TreeNode root, int x, int y) {
        h1 = 0;
        h1Parent = null;
        h2 = 0;
        h2Parent = null;
        tHeight(root,x,y,0,null);
        if(h1==h2&&h1Parent!=h2Parent){
            return true;
        }
        return false;
    }
    public void tHeight(TreeNode root,int x,int y,int height,TreeNode parent){
        if(root==null){
            return;
        }
        if(root.val==x){
            h1=height;
            h1Parent = parent;
            
        }
        if(root.val==y){
            h2=height;
            h2Parent = parent;
        }
        tHeight(root.left,x,y,height+1,root);
        tHeight(root.right,x,y,height+1,root);
        return;
    }
}