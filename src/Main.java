import Structures.BinaryTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.find(10));
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        System.out.println(tree.find(10));

        BinaryTree other = new BinaryTree();
        other.insert(7);
        other.insert(4);
        other.insert(1);
        other.insert(6);
        other.insert(9);
        other.insert(10);
        other.insert(8);
        System.out.println("tree.equals(other)? "+ tree.equals(other));

        System.out.println("kthNodes: "+ tree.kthNodes(35));

        System.out.println("tree.isBST? "+ tree.isBST());

        System.out.println("tree.height: "+ tree.height());

        System.out.println("traverseLevelOrder");
        tree.traverseLevelOrder();
        System.out.println("traversePreOrder");
        tree.traversePreOrder();
        System.out.println("traverseInOrder");
        tree.traverseInOrder();
        System.out.println("traversePostOrder");
        tree.traversePostOrder();
    }
}