package Homework170701;

public class MatrixProcessing {

	public static void main(String[] args) {
		int[][] matrix = {
				{0, -1, 2 },	
				{3, 4, 5},	
				{6, 7, 8},	
		};
		
		
		print_sum(matrix);

	}

	

	private static void print_sum(int[][] matrix) {
		
		int sum=0;
		Label: for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]<0) {
					continue Label;
				}
				sum+=matrix[i][j];	
			}
			System.out.println("Sum of elements in "+(i+1)+" row = "+sum);
			
		}
	}
	
}
