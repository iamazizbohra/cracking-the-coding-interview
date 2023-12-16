package com.crackingthecodinginterview.questions.chapter1.question2;

public class Solution2 {

	/**
	 * ASCII has 128 chars
	 */
	public boolean checkPermutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] visited = new int[128];

		for (int i : s.toCharArray()) {
			visited[i]++;
		}

		for (int j : t.toCharArray()) {
			visited[j]--;

			if (visited[j] < 0) {
				return false;
			}
		}

		return true;
	}

}
