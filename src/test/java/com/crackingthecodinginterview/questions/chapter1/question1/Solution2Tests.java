package com.crackingthecodinginterview.questions.chapter1.question1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution2Tests {

	@Test
	@DisplayName("String with unique chars test")
	public void givenString_whenIsUniqueChars_thenReturnTrue() {
		// given
		String string = "abcd";

		// when
		Solution2 obj = new Solution2();
		boolean expectedValue = obj.isUniqueChars(string);

		// then
		assertThat(expectedValue).isTrue();
	}

	@Test
	@DisplayName("String with not unique chars test")
	public void givenString_whenIsUniqueChars_thenReturnFalse() {
		// given
		String string = "abba";

		// when
		Solution2 obj = new Solution2();
		boolean expectedValue = obj.isUniqueChars(string);

		// then
		assertThat(expectedValue).isFalse();
	}

}
