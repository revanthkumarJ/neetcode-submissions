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
    boolean isBal=true;

    public int height(TreeNode root){
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);

        if(Math.abs(left-right)>1)
        isBal=false;

        return 1+Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        isBal=true;
        height(root);
        return isBal;

    }
}
