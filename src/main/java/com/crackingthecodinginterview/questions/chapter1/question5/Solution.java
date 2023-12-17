package com.crackingthecodinginterview.questions.chapter1.question5;

public class Solution {

	public boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return onEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return onEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return onEditInsert(second, first);
		}

		return false;
	}

	private boolean onEditReplace(String s1, String s2) {
		boolean foundDifference = false;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				// found 2nd mismatch char
				if (foundDifference)
					return false;

				foundDifference = true;
			}
		}

		return true;
	}

	private boolean onEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;

		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}

				index2++;
			} else {
				index1++;
				index2++;
			}
		}

		return true;
	}

}
