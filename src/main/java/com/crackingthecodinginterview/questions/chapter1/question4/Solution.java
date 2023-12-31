package com.crackingthecodinginterview.questions.chapter1.question4;

public class Solution {

	public boolean isPermutationOfPalindrome(String str) {
		int bitVector = createBitVector(str);

		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}

	/*
	 * Create a bit vector for the string.
	 * For each letter with value i, toggle the ith bit
	 */
	private int createBitVector(String str) {
		int bitVector = 0;

		for (char c : str.toCharArray()) {
			int index = getCharNumber(c);

			bitVector = toggleBit(bitVector, index);
		}

		return bitVector;
	}

	/*
	 * Toggle the ith bit in the integer
	 */
	private int toggleBit(int bitVector, int index) {
		if (index < 0)
			return bitVector;

		int mask = 1 << index;
		if ((bitVector & mask) == 0) {
			bitVector = bitVector | mask;
		} else {
			bitVector = bitVector & ~mask;
		}

		return bitVector;
	}

	/*
	 * Map each character to a number a -> 0, b -> 1, c -> 2, etc.
	 * This is case-insensitive.
	 * Non-letter characters map to -1
	 */
	private int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		int val = Character.getNumericValue(c);

		if (a <= val && val <= z) {
			return val - a;
		}

		return -1;
	}

	/*
	 * Check that exactly one bit is set by subtracting one from the integer
	 * and ANDing it with the original integer
	 */
	private boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}

}
