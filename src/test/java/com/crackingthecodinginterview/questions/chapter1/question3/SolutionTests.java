package com.crackingthecodinginterview.questions.chapter1.question3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTests {

	@Test
	@DisplayName("Replace spaces in a string test")
	void givenString_whenReplaceSpaces_thenReturnVoid() {
		// given
		String str = "Mr John Smith   ";

		// when
		char[] arr = str.toCharArray();
		Solution obj = new Solution();
		String expectedString = obj.replaceSpaces(arr);

		// then
		assertThat(expectedString).isEqualTo("Mr%20John%20Smith");
	}

}
