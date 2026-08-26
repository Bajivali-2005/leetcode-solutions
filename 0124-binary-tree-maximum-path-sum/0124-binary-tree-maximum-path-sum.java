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
    int ans = Integer.MIN_VALUE;

    private int maxsum(TreeNode root){
         if(root == null) return 0;

        int x = Math.max(0,maxsum(root.left));
        int y = Math.max(0,maxsum(root.right));

        ans = Math.max(ans,(x+y+root.val));

        return Math.max(x,y) + root.val;
    }
    
    public int maxPathSum(TreeNode root) {
       maxsum(root);
       return ans;
    }
}