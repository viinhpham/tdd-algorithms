package org.vinh.leetcode;

/**
 * Author : Vinh Pham.
 * Date: 7/25/21.
 * Time : 4:00 PM.
 */
public class CountGoodNodesBT {

public class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode() {}
 TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
    public int goodNodes(TreeNode root) {


        return dfs(root, root.val);

    }

    private int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        max = Math.max(max, root.val);

        return (root.val >= max ? 1 : 0) + dfs(root.left, max) + dfs(root.right, max);

    }
}
