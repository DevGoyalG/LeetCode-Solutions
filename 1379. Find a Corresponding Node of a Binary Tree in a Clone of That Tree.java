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

    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null){
            return cloned;
        }
        if(cloned.val == target.val){
            ans = cloned;
        }
        getTargetCopy(original, cloned.left, target);
        getTargetCopy(original, cloned.right, target);
        return ans;
    }

    
}
