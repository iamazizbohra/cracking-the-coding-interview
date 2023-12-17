package com.crackingthecodinginterview.questions.chapter1.question4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTests {

	@Test
	@DisplayName("Check if it is a permutation of palindrome test")
	public void givenString_whenIsPermutationOfPalindrome_thenReturnTrue() {
		// given
		String str = "tact coa";

		// when
		Solution obj = new Solution();
		boolean expectedValue = obj.isPermutationOfPalindrome(str);

		// then
		assertThat(expectedValue).isTrue();
	}

	@Test
	@DisplayName("Check if it is a permutation of non palindrome test")
	public void givenString_whenIsPermutationOfPalindrome_thenReturnFalse() {
		// given
		String str = "coat";

		// when
		Solution obj = new Solution();
		boolean expectedValue = obj.isPermutationOfPalindrome(str);

		// then
		assertThat(expectedValue).isFalse();
	}

}
