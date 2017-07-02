package Homework170701;

import java.util.concurrent.ThreadLocalRandom;

public class MatrixProcessing {

	public static void main(String[] args) {
		int[][] matrix = {
				{0, -1, 2 },	
				{3, 4, 5},	
				{6, -7, 8},	
		};
		
		int[][] matrix1 = make_random_matrix(20,2);
		print_sum(matrix1);
	}

	private static int[][] make_random_matrix(int row_size, int col_size) {
		// FIXME Auto-generated method stub
		int[][] mat=new int[row_size][col_size];
		
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				mat[i][j]=ThreadLocalRandom.current().nextInt(-100, 100);
			}
		}
		
		return mat;
	}

	private static void print_sum(int[][] matrix) {
		
		int sum=0;
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]<0) {
					System.out.println("There are negative elements in "+i+" row!");
					break;
				}
				sum+=matrix[i][j];
				if (j==matrix[i].length-1) {
					System.out.println("Sum of elements in "+i+" row = "+sum);
				}
			}
			
		}
	}
	
}
