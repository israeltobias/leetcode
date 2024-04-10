package org.leetcode.longestzigzag;

import org.leetcode.treenode.TreeNode;

/**
 * @author israel
 * Daily problem leetcode 2023-04-19
 * https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
 */
public class LongestZigZag {
    int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        solve(root, 0, 0);
        solve(root, 1, 0);
        return maxLength;
    }

    void solve(TreeNode root, int dir, int currentLength) {
        if (root == null) {
            return;
        }
        maxLength = Math.max(maxLength, currentLength);
        if (dir == 1) {
            solve(root.left,0,currentLength+1);
            solve(root.right,1,1);
        } else {
            solve(root.right,1,currentLength+1);
            solve(root.left,0,1);
        }
    }
}
