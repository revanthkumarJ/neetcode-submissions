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
    int curr;
    int res;
    public void traverse(TreeNode root,int k){
        if(root==null) return;
        traverse(root.left,k);
        curr++;
        if(curr==k){
            res=root.val;
        }
        else{
            traverse(root.right,k);
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        curr=0;
        res=-1;
        traverse(root,k);
        return res;
    }
}
