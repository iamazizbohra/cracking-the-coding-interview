package com.crackingthecodinginterview.questions.chapter1.question2;

import java.util.Arrays;

public class Solution1 {

	public boolean checkPermutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		return sort(s).equals(sort(t));
	}

	private String sort(String s) {
		char[] charArray = s.toCharArray();

		Arrays.sort(charArray);

		return new String(charArray);
	}

}
