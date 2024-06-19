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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ans1=new ArrayList<Integer>();
        List<Integer> ans2=new ArrayList<Integer>();
        preorder(p,ans1);
        preorder(q,ans2);
        if(ans1.equals(ans2)){
            return true;
        }
        return false;

        

        
    }
    public void preorder(TreeNode root,List<Integer> ans){
        if(root==null){
            ans.add(null);
            return ;
        }else{
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);}
        return;
        
    }
    

}