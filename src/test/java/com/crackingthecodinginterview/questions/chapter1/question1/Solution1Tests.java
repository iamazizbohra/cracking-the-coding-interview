package com.crackingthecodinginterview.questions.chapter1.question1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution1Tests {

	@Test
	@DisplayName("String with unique chars test")
	public void givenString_whenIsUniqueChars_thenReturnTrue() {
		// given
		String string = "abcd";

		// when
		Solution1 solution1 = new Solution1();
		boolean expectedValue = solution1.isUniqueChars(string);

		// then
		assertThat(expectedValue).isTrue();
	}

	@Test
	@DisplayName("String with not unique chars test")
	public void givenString_whenIsUniqueChars_thenReturnFalse() {
		// given
		String string = "abba";

		// when
		Solution1 solution1 = new Solution1();
		boolean expectedValue = solution1.isUniqueChars(string);

		// then
		assertThat(expectedValue).isFalse();
	}

}
