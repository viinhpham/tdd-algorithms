package org.vinh.tdd.leetcode;

/**
 * Author : Vinh Pham.
 * Date: 20/06/2021.
 * Time : 16:31.
 */
public class ValidBinarySearchTree {
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

	class Solution {
		public boolean isValidBST(TreeNode root) {
			return helper(root, null, null);
		}
		public boolean helper(TreeNode node, Integer low, Integer high) {
			if (node == null){
				return true;
			}
			if (low != null && node.val <= low || high != null && node.val >= high) {
				return false;
			}
			return  helper(node.left, low, node.val) && helper(node.right, node.val, high);
		}
	}
}
