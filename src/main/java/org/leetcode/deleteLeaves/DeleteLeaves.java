package org.leetcode.deleteLeaves;

import org.leetcode.treenode.TreeNode;

/**
 * @author israel
 * Daily problem leetcode 2024-05-17
 * <a href="https://leetcode.com/problems/delete-leaves-with-a-given-value/description/?envType=daily-question&envId=2024-05-17">...</a>
 */
public class DeleteLeaves {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.getVal() == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}
