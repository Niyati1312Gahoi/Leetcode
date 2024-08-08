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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        return path(root,targetSum);
        
       
    }
    public int path(TreeNode root,long targetSum){
        if(root==null) return 0;
        int ans = countpath(root,targetSum);
       int l= path(root.left,targetSum);
       int r=  path(root.right,targetSum);
       return ans+l+r;

    }
    public int countpath(TreeNode root,long target){
         if(root==null) return 0;
        int c=0;
        if(target-root.val==0){
            c++;
        }
        int left=countpath(root.left,target-root.val);
        int right=countpath(root.right,target-root.val);
         return left+right+c;
        
    }
}
