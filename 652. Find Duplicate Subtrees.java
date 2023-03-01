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
        List<TreeNode> res=new ArrayList<>();
        HashMap<String,Integer> dic =new HashMap<>();

        public String solve(TreeNode root){
            if(root==null) return "";
            String val = root.val + "_" + solve(root.left) + "_" + solve(root.right);
            // dic[val+=1]
            dic.put(val,dic.getOrDefault(val,0)+1);
            if(dic.get(val)==2) res.add(root);
            return val;
        }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        solve(root);
        return res;
    }
}