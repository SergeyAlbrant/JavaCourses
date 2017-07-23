package HackerRank;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxHourGlass(arr));
        
        
	}

	private static int maxHourGlass(int[][] arr) {
		
		int max = -100;
		int curr = -100;
		for(int i=1; i < 5; i++){
            for(int j=1; j < 5; j++){
                curr=arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if (curr>max) max = curr;
            }
        }
		return max;
	}
}
