package com.crackingthecodinginterview.questions.chapter1.question7;

public class Solution {

	public int[][] rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			throw new IllegalArgumentException("Matrix is not square");
		}

		int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = matrix[first][i];

				// move left -> top
				matrix[first][i] = matrix[last - offset][first];

				// move bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// move right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// move top -> right
				matrix[i][last] = top;
			}
		}

		return matrix;

	}

}
