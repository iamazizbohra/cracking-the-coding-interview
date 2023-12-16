package com.crackingthecodinginterview.questions.chapter1.question1;

public class Solution2 {

	/*
	 * ASCII has 128 chars
	 * assume string has lower case letters a to z
	 */
	public boolean isUniqueChars(String str) {

		int pattern = 0;

		for (int i = 0; i < str.length(); i++) {
			/*
			 * Example: a => ASCII value is 97
			 * a - a => 97 - 97 = 0
			 * b - a => 98 - 97 = 1
			 */

			int value = str.charAt(i) - 'a';

			if ((pattern & (1 << value)) > 0) {
				return false;
			}

			pattern = pattern | (1 << value);
		}

		return true;
	}

}
