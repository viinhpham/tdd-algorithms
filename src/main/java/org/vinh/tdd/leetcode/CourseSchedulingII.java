package org.vinh.tdd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Author : Vinh Pham.
 * Date: 11/06/2021.
 * Time : 15:49.
 */
/*There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first
if you want to take course ai.For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them.
If it is impossible to finish all courses, return an empty array.*/
public class CourseSchedulingII {
	private boolean iscycl;

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] awswer = new int[numCourses];
		Stack<Integer> s = new Stack<>();
		boolean[] visited = new boolean[numCourses];
		List<List<Integer>> adjlist = new ArrayList<>();
		for (int i = 0; i < numCourses; i++) {
			adjlist.add(new ArrayList<>());
		}
		for (int [] pair : prerequisites) {
			adjlist.get(pair[1]).add(pair[0]);
		}

		for (int i = 0; i < numCourses; i++) {
			dfs(i, adjlist, visited , s);
		}
		if (iscycl) {
			return awswer;
		}
		for(int i = 0; i<numCourses;i++) {
			awswer[i] = s.pop();
		}

		return awswer;
	}

	private void dfs(int i, List<List<Integer>> adjlist, boolean[] visited, Stack stack) {
		if (visited[i]) {
			return;
		}
		visited[i] = true;
		List<Integer> adj = adjlist.get(i);
		if (adj != null && adj.size() > 0) {
			for (Integer integer : adjlist.get(i)) {
				if (visited[integer]) {//acylic
					iscycl = true;
					return;
				}
				dfs(integer, adjlist, visited, stack);
			}
		}
		stack.push(i);
	}
}
