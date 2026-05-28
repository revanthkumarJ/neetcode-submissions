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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            int size=queue.size();
            List<Integer> newList=new ArrayList<>();
            for(int i=1;i<=size;i++){
                TreeNode ele=queue.poll();
                if(ele.left!=null)
                queue.add(ele.left);
                if(ele.right!=null)
                queue.add(ele.right);
                newList.add(ele.val);
            }
            res.add(newList);
        }

        return res;
    }
}
