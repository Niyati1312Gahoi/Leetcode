/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l1=new ArrayList<>();
        List<TreeNode> l2=new ArrayList<>();
        getpath(root,p,l1);
        getpath(root,q,l2);
        int i=0;
        while(i<l1.size()&& i<l2.size()){
            if(l1.get(i)!=l2.get(i)){
                break;
            }
            i++;
        }
        return l1.get(i-1);
    }
    public boolean  getpath(TreeNode root,TreeNode k,List<TreeNode> l){
        if(root==null){
            return false;
        }
        l.add(root);
        if(root== k){
            return true;
        }
        if(getpath(root.left,k,l) || getpath(root.right,k,l)){
            return true;
        }
        l.remove(l.size()-1);
        return false;
    }
}