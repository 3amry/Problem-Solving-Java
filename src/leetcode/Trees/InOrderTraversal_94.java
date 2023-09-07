package leetcode.Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal_94 {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> inOrderTraversal(TreeNode root) {
        if (root == null) return list;

        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);

        return list;
    }

}
