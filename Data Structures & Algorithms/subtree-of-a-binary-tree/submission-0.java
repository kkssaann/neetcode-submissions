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
    public boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        boolean l = isSame(p.left,q.left);
        boolean r = isSame(p.right,q.right);

        return l&&r ;
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null || subRoot==null){
            return false;
        }
        if(isSame(root,subRoot)){
            return true;
        }

        boolean search_left = isSubtree(root.left,subRoot);
        boolean search_right = isSubtree(root.right,subRoot);

        return search_left || search_right;

    }
}
