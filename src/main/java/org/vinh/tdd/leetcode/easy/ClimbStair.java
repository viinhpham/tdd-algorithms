package org.vinh.tdd.leetcode.easy;

/**
 * Author : Vinh Pham.
 * Date: 25/06/2021.
 * Time : 08:23.
 */
public class ClimbStair {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
	/*public static int climbStairs(int n) {
		int [] dp = new int[n + 1];
		dp[1] =  1;
		dp[2] = 2;
		for (int i = 3; i <=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];

	}*/

	public static int climbStairs(int n) {
		int memo[] = new int[n + 1];
		return climb_Stairs(0, n, memo);
	}
	public static int climb_Stairs(int i, int n, int memo[]) {
		if (i > n) {
			return 0;
		}
		if (i == n) {
			return 1;
		}
		if (memo[i] > 0) {
			return memo[i];
		}
		memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
		return memo[i];
	}
}
