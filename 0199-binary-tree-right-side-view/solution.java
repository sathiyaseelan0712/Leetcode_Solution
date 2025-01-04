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
        List<Integer> val = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return val;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            for(int count = q.size(); count != 0;count--){
                TreeNode curr = q.remove();
                ans.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            val.add(ans.get(ans.size()-1));
        }
        return val;
    }
}
