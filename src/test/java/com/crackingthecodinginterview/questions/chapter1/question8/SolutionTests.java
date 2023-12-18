package com.crackingthecodinginterview.questions.chapter1.question8;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTests {

	@Test
	@DisplayName("Zero matrix test")
	public void givenMatrix_whenSetZeros_thenReturnZeroMatrix() {
		// given
		int[][] actualMatrix = {
				{ 0, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 0, 1 },
				{ 1, 1, 1, 1 }
		};

		// when
		Solution obj = new Solution();
		int[][] expectedMatrix = obj.setZeros(actualMatrix);

		// then
		assertAll(
				() -> assertThat(expectedMatrix[0]).containsExactly(0, 0, 0, 0),
				() -> assertThat(expectedMatrix[1]).containsExactly(0, 1, 0, 1),
				() -> assertThat(expectedMatrix[2]).containsExactly(0, 0, 0, 0),
				() -> assertThat(expectedMatrix[3]).containsExactly(0, 1, 0, 1));
	}

}
