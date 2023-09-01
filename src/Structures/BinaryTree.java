package Structures;

import java.util.ArrayList;

public class BinaryTree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var currentNode = root;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = node;
                    break;
                }
                currentNode = currentNode.leftChild;
            } else {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = node;
                    break;
                }
                currentNode = currentNode.rightChild;
            }
        }

    }

    public boolean find(int value) {
        var currentNode = root;
        while (currentNode != null) {
            if (currentNode.value == value) return true;
            currentNode = value < currentNode.value ? currentNode.leftChild : currentNode.rightChild;
        }
        return false;
    }

    public void traversePreOrder() { traversePreOrder(root); }
    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() { traverseInOrder(root);}
    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() { traversePostOrder(root);}
    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() { return height(root); }
    private int height(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.rightChild), height(root.leftChild));
    }

//    O(log n)
    public int BinarySearchMin() {
        if (root == null) throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }
//    O(n)
    private int min(Node root) {
        if (isLeaf(root)) return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    private boolean isLeaf(Node node) {
        return node.rightChild == null && root.leftChild == null;
    }

    public boolean equals(BinaryTree other) {
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.value < min || root.value > max) return false;

        return
                isBST(root.leftChild, min, root.value)
                        && isBST(root.rightChild, root.value, max);
    }

    public ArrayList<Integer> kthNodes(int distance) {
        var nodes = new ArrayList<Integer>();
        kthNodes(root, distance, nodes);
        return nodes;
    }
    private void kthNodes(Node root, int distance, ArrayList<Integer> nodes) {
        if (root == null) return;

        if (distance == 0) {
            nodes.add(root.value);
            return;
        }

        kthNodes(root.leftChild, distance - 1, nodes);
        kthNodes(root.rightChild, distance - 1, nodes);
    }

    public void traverseLevelOrder() {
        for (int i = 0; i <= height(); i++) {
            for (var value : kthNodes(i)) System.out.println(value);
        }
    }
}
