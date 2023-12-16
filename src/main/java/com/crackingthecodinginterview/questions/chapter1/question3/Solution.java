package com.crackingthecodinginterview.questions.chapter1.question3;

public class Solution {

	public String replaceSpaces(char[] str) {
		int spaceCount = 0, i;

		// count total space
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}

		// exclude trailing spaces & find true length
		while (str[i - 1] == ' ') {
			spaceCount--;
			i--;
		}

		int newStrLength = i + spaceCount * 2;
		int newStrIndex = newStrLength - 1;

		char[] newStr = new char[newStrLength];

		for (int j = i - 1; j >= 0; j--) {
			if (str[j] == ' ') {
				newStr[newStrIndex] = '0';
				newStr[newStrIndex - 1] = '2';
				newStr[newStrIndex - 2] = '%';

				newStrIndex = newStrIndex - 3;
			} else {
				newStr[newStrIndex] = str[j];
				
				newStrIndex--;
			}
		}

		return new String(newStr);

	}

}
