package leetcode.Trees;

public class SortedArrayToBST_108 {
    public TreeNode sortedArrayToBST(int[] arr) {
        return createBST(arr, 0, arr.length -1);
    }

    private TreeNode createBST(int[] arr, int startIndex, int endIndex) {
        if (startIndex > endIndex) return null;

        int rootIndex = (startIndex + endIndex)/2;
        TreeNode root = new TreeNode(arr[rootIndex]);

        root.left = createBST(arr, startIndex, rootIndex - 1);
        root.right = createBST(arr, rootIndex + 1, endIndex);

        return root;
    }
}
