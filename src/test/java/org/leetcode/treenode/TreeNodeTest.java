package org.leetcode.treenode;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void longestZigZag(){
        Integer[] nodes = {1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1};
        TreeNode treeNode = new TreeNode();
      //  TreeNode res = treeNode.insertLevelOrder(nodes, 0);
        TreeNode res = treeNode.fromArray(nodes);
        treeNode.show(res);

    }
}