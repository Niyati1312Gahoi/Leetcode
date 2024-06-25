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
    public boolean isSymmetric(TreeNode root) {

       if(root==null){
        return true;
       }
       return mirrortree(root.left,root.right);

        
    }
    public boolean mirrortree(TreeNode y1,TreeNode y2){
        if(y1==null && y2==null){
            return true;
        }else if(y1==null || y2==null){
            return false;
        }
        return (y1.val == y2.val) && mirrortree(y1.left,y2.right) && mirrortree(y1.right,y2.left);
           
    }


}
