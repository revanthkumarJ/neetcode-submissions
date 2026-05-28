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
    public int help(TreeNode root, int max){
        if(root==null) return 0;
        int curr=root.val;
        if(curr>=max){
            return 1+help(root.left,curr)+help(root.right,curr);
        }
        else{
            return help(root.left,max)+help(root.right,max);
        }
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return help(root,root.val);
    }
}
