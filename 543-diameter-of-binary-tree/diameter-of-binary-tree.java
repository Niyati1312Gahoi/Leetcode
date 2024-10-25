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
    public int diameterOfBinaryTree(TreeNode root) {
      return diameter(root).d;
        
    }
    public diapair diameter(TreeNode root){
        if(root==null){
            return new diapair();
        }
        diapair ldp=diameter(root.left);
         diapair rdp=diameter(root.right);
          diapair sdp=new diapair();
           sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
          int sd=ldp.ht+rdp.ht+2;
          sdp.d=Math.max(sd,Math.max(ldp.d,rdp.d));
          return sdp;

    }
    class diapair{
        int d=0;
        int ht=-1;
    }
    
}