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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        while(root!=null){
            List<Integer> leaves =new ArrayList<>();
            root=remove(root,leaves);
            result.add(leaves);
        }
        return result;
    }
    public TreeNode remove(TreeNode node,List<Integer> leaves){
        if(node ==null){
            return null;
        }
        if(node.left==null && node.right==null){
            leaves.add(node.val);
            return null;
        }
        node.left=remove(node.left,leaves);
        node.right=remove(node.right,leaves);

        return node;
    }
}
