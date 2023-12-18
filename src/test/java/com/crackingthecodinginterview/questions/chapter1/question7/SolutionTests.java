package com.crackingthecodinginterview.questions.chapter1.question7;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTests {

	@Test
	@DisplayName("Rotate matrix by 90 degree test")
	public void givenMatrix_whenRotate_thenReturnRotatedMatrix() {
		// given
		int[][] actualMatrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};

		// when
		Solution obj = new Solution();
		int[][] expectedMatrix = obj.rotate(actualMatrix);

		// then
		assertAll(
				() -> assertThat(expectedMatrix[0]).containsExactly(13, 9, 5, 1),
				() -> assertThat(expectedMatrix[1]).containsExactly(14, 10, 6, 2),
				() -> assertThat(expectedMatrix[2]).containsExactly(15, 11, 7, 3),
				() -> assertThat(expectedMatrix[3]).containsExactly(16, 12, 8, 4));
	}

	@Test
	@DisplayName("Rotate uneven matrix by 90 degree test")
	public void givenMatrix_whenRotate_thenReturnMatrix() {
		// given
		int[][] actualMatrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }
		};

		// when
		Solution obj = new Solution();
		Throwable thrown = catchThrowable(() -> obj.rotate(actualMatrix));

		// then
		assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
	}

}
