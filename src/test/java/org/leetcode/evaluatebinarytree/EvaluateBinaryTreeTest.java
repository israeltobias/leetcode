package org.leetcode.evaluatebinarytree;

import org.junit.jupiter.api.Test;
import org.leetcode.treenode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateBinaryTreeTest {

    @Test
    void case1() {
        Integer[] root = {2,1,3,null,null,0,1};
        TreeNode treeNode = new TreeNode();
        TreeNode rootNode = treeNode.fromArray(root);
        EvaluateBinaryTree evaluateBinaryTree = new EvaluateBinaryTree();
        boolean res = evaluateBinaryTree.evaluateTree(rootNode);
        assertTrue(res);
    }

    @Test
    void case2() {
        Integer[] root = {0};
        TreeNode treeNode = new TreeNode();
        TreeNode rootNode = treeNode.fromArray(root);
        EvaluateBinaryTree evaluateBinaryTree = new EvaluateBinaryTree();
        boolean res = evaluateBinaryTree.evaluateTree(rootNode);
        assertFalse(res);
    }
}