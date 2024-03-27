package org.example;

import org.example.entity.TreeNode;
import org.junit.Test;


public class AppTest {

    @Test
    public void TestRun() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;

    }
}
