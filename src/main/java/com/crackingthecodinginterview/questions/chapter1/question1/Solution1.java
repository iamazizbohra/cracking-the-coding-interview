package com.crackingthecodinginterview.questions.chapter1.question1;

public class Solution1 {

	public boolean isUniqueChars(String str) {
		// ASCII has 128 chars
		if (str.length() > 128)
			return false;

		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);

			// already visited
			if (charSet[index])
				return false;

			// mark as visited
			charSet[index] = true;
		}

		return true;
	}

}
