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
    public int prev=-1;
    public boolean isInOrder(TreeNode root){
        if(root==null)
        return true;
        if(!isInOrder(root.left))
        return false;

        if(prev!=-1 && root.val<=prev){
            return false;
        }
        prev=root.val;

        return isInOrder(root.right);

    }
    public boolean isValidBST(TreeNode root) {
        prev=-1;
        return isInOrder(root);
    }
}
