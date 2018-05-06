package com.peter.interview.tree;


import java.util.LinkedList;
import java.util.Queue;

//计算某个树的最大深度
public class DepthDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.right = node6;
        node3.right = node7;

        System.out.println("递归实现深度:   " + getMaxDepth(node1));
        System.out.println("非递归实现深度: " + getMaxDepthNonRecursive(node1));

    }

    //递归算法得到最大深度
    public static int getMaxDepth(Node node) {
        if (node == null) {
            return 0;
        }

        return getMaxDepth(node.left) > getMaxDepth(node.right) ? getMaxDepth(node.left) + 1 : getMaxDepth(node.right) + 1;
    }

    //广度遍历 从上到下 从左到右
    public static int getMaxDepthNonRecursive(Node node) {
        if (node == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        int depth = 0;
        queue.add(node);

        while (!queue.isEmpty()) {
            int cur = 0;
            int size = queue.size();
            while (cur < size) {
                Node curNode = queue.poll();
                System.out.print(curNode.number + " ");
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
                cur++;
            }
            depth++;
        }
        System.out.println();
        return depth;
    }

    public static int getcleanMaxDepthNonRecursive(Node node) {
        if (node == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        int depth = 0;
        queue.add(node);

        while (!queue.isEmpty()) {
            int cur = 0;
            int size = queue.size();
            while (cur < size) {
                Node curNode = queue.poll();
                cur++;
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            depth++;
        }
        return depth;
    }

}
