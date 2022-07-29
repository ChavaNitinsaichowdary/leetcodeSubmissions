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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return tree(0,postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
    public TreeNode tree(int postStart,int postEnd,int inStart,int inEnd,int[] inorder,int[] postorder){
        if(postStart>postEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0;
        for(int i = inStart;i<=inEnd;i++){
            if(postorder[postEnd]==inorder[i]){
                index = i;
                break;
            }
        }
        root.left = tree(postStart,postStart+index-inStart-1,inStart,index-1,inorder,postorder);
        root.right = tree(postEnd+index-inEnd,postEnd-1,index+1,inEnd,inorder,postorder);
        return root;
    }
}