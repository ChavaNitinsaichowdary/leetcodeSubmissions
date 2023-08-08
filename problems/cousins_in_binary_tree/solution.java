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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int xlevel = -1;
        int ylevel = -2;
        int level = 0;
        while(!q.isEmpty()){
            
            int sz = q.size();
            while(sz-->0){
                TreeNode curr = q.poll();
                if(curr.left!=null&&curr.right!=null){
                    if(curr.left.val ==x && curr.right.val==y){
                        return false;
                    }
                    if(curr.left.val ==y && curr.right.val==x){
                        return false;
                    }
                }
                if(curr.val==x) xlevel = level;
                if(curr.val==y) ylevel = level;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            level++;
        }
        return xlevel==ylevel;
    }
}