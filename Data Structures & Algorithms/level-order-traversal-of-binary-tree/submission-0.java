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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null){
            return new ArrayList<>();
        }
        
        q.add(root);

        while(!q.isEmpty()){

            List<Integer> temp = new ArrayList<>();
            int lvl_size = q.size();
            
            while(lvl_size>0){
                TreeNode store = q.peek();
                q.poll();
                temp.add(store.val);
            
                if(store.left != null){
                    q.add(store.left);
                }
                if(store.right != null){
                    q.add(store.right);
                }

                lvl_size--;
            }
            res.add(temp);   
        }
        return res;
    }
}
