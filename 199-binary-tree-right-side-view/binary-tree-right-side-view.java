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
    int maxdepth=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightview(root,1,ans);
        return ans;
        
    }
    public void rightview(TreeNode root,int curr_level,List<Integer> ans){
        if(root==null) return;
        if(curr_level>maxdepth){
            ans.add(root.val);
            maxdepth=curr_level;
        }
        rightview(root.right,curr_level+1,ans);
       rightview(root.left,curr_level+1,ans);

    }
}