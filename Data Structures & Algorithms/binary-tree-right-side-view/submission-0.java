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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root!=null)
        q.add(root);
        List<Integer> result=new ArrayList<>();
        while(q.size()>0){
            int currSize=q.size();
            for(int i=1;i<=currSize;i++){
                TreeNode ele= q.poll();
                if(i==currSize)
                result.add(ele.val);
                if(ele.left!=null)
                q.add(ele.left);
                if(ele.right!=null){
                    q.add(ele.right);
                }
            }
        }
        return result;
    }
}
