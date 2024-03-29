package org.vinh.tdd.leetcode.slidingwindow;

/**
 * Author : Vinh Pham.
 * Date: 7/6/21.
 * Time : 4:28 PM.
 */
public class NumberOfInsland {
	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				dfs(grid, i, j);
				count++;
			}
		}
		return count;

	}


	private void dfs(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0') {
			return;
		}
		grid[i][j] = '0';
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);
		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
	}
}
