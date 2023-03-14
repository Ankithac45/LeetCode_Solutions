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
    public int solve(TreeNode root,int val){
        if(root==null){
            return 0;
        }
        int sum=val*10+root.val;
        if(root.left==null && root.right==null){
            return sum;
        }
        return solve(root.left,sum)+solve(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
}