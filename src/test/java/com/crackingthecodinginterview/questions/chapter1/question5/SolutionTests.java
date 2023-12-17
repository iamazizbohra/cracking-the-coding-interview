package com.crackingthecodinginterview.questions.chapter1.question5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {

	@ParameterizedTest
	@DisplayName("One edit away test")
	@MethodSource("methodSourceArgsFactory")
	public void givenString_whenOneEditAway_thenReturnTrue(String first, String second, boolean expectedValue) {
		// given
		String s1 = first;
		String s2 = second;

		// when
		Solution obj = new Solution();
		boolean actualValue = obj.oneEditAway(s1, s2);

		// then
		assertThat(actualValue).isEqualTo(expectedValue);
	}

	private static Stream<Arguments> methodSourceArgsFactory() {
		return Stream.of(
				Arguments.of("pale", "ple", true),
				Arguments.of("pales", "pale", true),
				Arguments.of("pale", "bale", true),
				Arguments.of("pale", "bae", false));
	}

}
