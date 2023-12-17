package com.crackingthecodinginterview.questions.chapter1.question3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTests {

	@Test
	@DisplayName("Replace spaces in a string test")
	public void givenString_whenReplaceSpaces_thenReturnVoid() {
		// given
		String str = "Mr John Smith   ";

		// when
		Solution obj = new Solution();
		String expectedValue = obj.replaceSpaces(str.toCharArray());

		// then
		assertThat(expectedValue).isEqualTo("Mr%20John%20Smith");
	}

}
