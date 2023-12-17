package com.crackingthecodinginterview.questions.chapter1.question6;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {

	@ParameterizedTest
	@DisplayName("String compression test")
	@MethodSource("methodSourceArgsFactory")
	public void givenString_whenCompress_thenReturnValue(String first, String expectedValue) {
		// given
		String s1 = first;

		// when
		Solution obj = new Solution();
		String actualValue = obj.compress(s1);

		// then
		assertThat(actualValue).isEqualTo(expectedValue);
	}

	private static Stream<Arguments> methodSourceArgsFactory() {
		return Stream.of(
				Arguments.of("aabcccccaaa", "a2b1c5a3"),
				Arguments.of("abcde", "abcde"));
	}

}
