package org.leetcode.sumrootleaf;

import org.leetcode.treenode.TreeNode;
/**
 * @author israel
 * Daily problem leetcode 2024-04-15
 * <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=daily-question&envId=2024-04-15">...</a>
 */
public class SumRootLeaf {

    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    private int dfs (TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        sum = sum*10 + root.getVal();

        if(root.left == null && root.right== null){
            return sum;
        }
        return dfs(root.left,sum) + dfs(root.right,sum);
    }
}
