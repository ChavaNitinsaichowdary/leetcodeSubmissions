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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return tree(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode tree(int preStart,int inStart,int inEnd,int[] preorder,int[] inorder){
        if(preStart>preorder.length-1||inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for(int i = inStart;i<=inEnd;i++){
            if(inorder[i]==preorder[preStart]){
                index = i;
            }
        }
        root.left = tree(preStart+1,inStart,index-1,preorder,inorder);
        root.right = tree(preStart+index-inStart+1,index+1,inEnd,preorder,inorder);
        return root;
    }
}