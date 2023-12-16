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
		Solution1 obj = new Solution1();
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
		Solution1 obj = new Solution1();
		boolean expectedValue = obj.isUniqueChars(string);

		// then
		assertThat(expectedValue).isFalse();
	}

	@Test
	@DisplayName("String with more than 128 chars test")
	public void givenLongString_whenIsUniqueChars_thenReturnFalse() {
		// given
		String string = "PPYSKGKoojqMVhLt1ErVYN3cx1juTEhxIernMcpD5wvBR3lrSAESkMTLJObpjr25UewIMPSML6jc3ZO7jvaYACAkj1alrGIK03tuQG9ueyakycOd0JLSf1XdvOt6JZswCW";

		// when
		Solution1 obj = new Solution1();
		boolean expectedValue = obj.isUniqueChars(string);

		// then
		assertThat(expectedValue).isFalse();
	}

}
