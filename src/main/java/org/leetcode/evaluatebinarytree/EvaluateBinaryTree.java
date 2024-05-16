package org.leetcode.evaluatebinarytree;

import org.leetcode.treenode.TreeNode;

/**
 * @author israel
 * Daily problem leetcode 2024-05-16
 * <a href="https://leetcode.com/problems/evaluate-boolean-binary-tree/description/?envType=daily-question&envId=2024-05-16">...</a>
 */
public class EvaluateBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            return root.getVal() != 0 ;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        if(root.getVal() == 2) return left || right;
        return left && right;
    }


}
