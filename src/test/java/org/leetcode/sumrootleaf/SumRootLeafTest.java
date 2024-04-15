package org.leetcode.sumrootleaf;

import org.junit.jupiter.api.Test;
import org.leetcode.treenode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SumRootLeafTest {

    @Test
    void case1(){
        Integer[] root = {1,2,3};
        TreeNode treeNode = new TreeNode();
        TreeNode rootNode = treeNode.fromArray(root);
        SumRootLeaf sumRootLeaf = new SumRootLeaf();
        int response = sumRootLeaf.sumNumbers(rootNode);
        assertEquals(25,response);
    }

    @Test
    void case2(){
        Integer[] root = {4,9,0,5,1};
        TreeNode treeNode = new TreeNode();
        TreeNode rootNode = treeNode.fromArray(root);
        SumRootLeaf sumRootLeaf = new SumRootLeaf();
        int response = sumRootLeaf.sumNumbers(rootNode);
        assertEquals(1026,response);
    }

}