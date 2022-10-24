package org.vinh.tdd.leetcode;

/**
 * Author : Vinh Pham.
 * Date: 7/7/21.
 * Time : 12:16 AM.
 */
public class MaxAreaOfIland {
	public int maxAreaOfIsland(int[][] grid) {
		int max = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					int count = 0;
					max = Math.max(max, dfs(grid, i, j, count));
				}

			}
		}

		return max;

	}

	public int dfs(int[][] grid, int i, int j, int count) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
			return 0;
		}

		grid[i][j] = 0;
		return 1 + dfs(grid, i, j - 1, count) + dfs(grid, i, j + 1, count) + dfs(grid, i - 1, j, count) + dfs(grid, i + 1, j, count);


	}
}
