package com.crackingthecodinginterview.questions.chapter1.question2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution1Tests {

	@Test
	@DisplayName("Strings with same chars test")
	public void givenTwoString_whenCheckPermutation_thenReturnTrue() {
		// given
		String s = "abdc";
		String t = "dcba";

		// when
		Solution1 obj = new Solution1();
		boolean expectedValue = obj.checkPermutation(s, t);

		// then
		assertThat(expectedValue).isTrue();
	}

	@Test
	@DisplayName("Strings with different chars test")
	public void givenTwoString_whenCheckPermutation_thenReturnFalse() {
		// given
		String s = "qdrt";
		String t = "trvd";

		// when
		Solution1 obj = new Solution1();
		boolean expectedValue = obj.checkPermutation(s, t);

		// then
		assertThat(expectedValue).isFalse();
	}

}
