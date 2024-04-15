package org.leetcode.treenode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode insertLevelOrder(Object[] arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            if (arr[i] != null) {
                root = new TreeNode((int) arr[i]);

                // insert left child
                root.left = insertLevelOrder(arr, 2 * i + 1);

                // insert right child
                root.right = insertLevelOrder(arr, 2 * i + 2);
            }
        }
        return root;
    }

    public TreeNode fromArray(Integer[] tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if (node.left == null) {
                if (tree[i] != null) {
                    node.left = new TreeNode(tree[i]);
                    q.add(node.left);
                }
            } else if (node.right == null) {
                if (tree[i] != null) {
                    node.right = new TreeNode(tree[i]);
                    q.add(node.right);
                }
                q.remove();
            }
        }
        return root;
    }

    public void show(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, "", "", root);
        System.out.println(sb.toString());
    }
    public void traversePreOrder(StringBuilder sb, String padding, String pointer, TreeNode node) {
        if (node != null) {
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.val);
            sb.append("\n");

            StringBuilder paddingBuilder = new StringBuilder(padding);
            paddingBuilder.append("│  ");

            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└──";
            String pointerForLeft = (node.right != null) ? "├──" : "└──";

            traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
            traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
