package leetcode.Trees;

public class BalancedBinaryTree_110 {
//    Approach 1 O(n^2)
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
//    Approach 2 post-order O(n)
    private int height2(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height2(root.left);
        int rightHeight = height2(root.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean isBalanced2(TreeNode root) {
        return height2(root) != -1;
    }

//    Approach 3 post-order O(n)
    private boolean isBalanced = true;
    public boolean isBalanced3(TreeNode root) {
        height3(root);
        return isBalanced;
    }

    private int height3(TreeNode root) {
        if (root == null || !isBalanced) return 0;

        int leftHeight = height3(root.left);
        int rightHeight = height3(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            isBalanced = false;

        return 1 + Math.max(leftHeight, rightHeight);
    }

}
