package com.crackingthecodinginterview.questions.chapter1.question8;

public class Solution {

	public int[][] setZeros(int[][] matrix) {

		boolean rowHasZero = false;
		boolean colHasZero = false;

		// check if first row has a zero
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}

		// check if first column has a zero
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][0] == 0) {
				colHasZero = true;
				break;
			}
		}

		// check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}

			}
		}

		// nullify rows based on the first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}

		// nullify columns based on the first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}

		// nullify first row & column as necessary
		if (rowHasZero)
			nullifyRow(matrix, 0);
		
		if (colHasZero)
			nullifyColumn(matrix, 0);

		return matrix;
	}

	private void nullifyRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}

	private void nullifyColumn(int[][] matrix, int col) {
		for (int j = 0; j < matrix.length; j++) {
			matrix[j][col] = 0;
		}
	}

}
