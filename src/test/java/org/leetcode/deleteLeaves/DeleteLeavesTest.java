package org.leetcode.deleteLeaves;

import org.junit.jupiter.api.Test;
import org.leetcode.treenode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class DeleteLeavesTest {

    @Test
    void case1(){
        Integer[] root = {1,2,3,2,null,2,4};
        Integer[] expected = {1,null,3,null,4};
        TreeNode treeNode = new TreeNode();
        TreeNode treeNodeExpected = new TreeNode();
        TreeNode rootNodeExpected = treeNodeExpected.fromArray(expected);
        TreeNode rootNode = treeNode.fromArray(root);
        DeleteLeaves deleteLeaves = new DeleteLeaves();
        TreeNode response = deleteLeaves.removeLeafNodes(rootNode, 2);
        assertThat(response)
                .usingRecursiveComparison()
                .isEqualTo(rootNodeExpected);
      //  assertEquals(rootNodeExpected, response);
    }
}