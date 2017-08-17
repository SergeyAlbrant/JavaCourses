package Homework170816;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {
	public static void main(String[] args) {
		
		//String[] a = new String[] {"Zg","Ng","Yu"};
		//sort(a,2);
		//System.out.println(Arrays.toString(a));
//		int n1 = Integer.MIN_VALUE;
//		int n2 = Integer.MAX_VALUE;
//		System.out.println(Integer.toBinaryString(n2));
//		System.out.println(Integer.toBinaryString(n1));
		int[] a = new int[] {12,56,78,32,5,97,3,14,64};
		sort(a);
		System.out.println(Arrays.toString(a));
		
		 final int SIZE = 1_000_000;

	     Random r = new Random();
	     int[] test = new int[SIZE];

	     for (int i = 0; i < SIZE; i++){
	         test[i] = r.nextInt(Integer.MAX_VALUE);
	     }

	     long start = System.currentTimeMillis();
	     sort(test);
	     long end = System.currentTimeMillis();
	     System.out.println(end-start);
	     
	     start = System.currentTimeMillis();
	     Arrays.sort(test);
	     end = System.currentTimeMillis();
	     System.out.println(end-start);
	     
		

		
	}
	
	public static void sort(int[] num) {
		int N = num.length;
		char[][]bytes = new char[N][4];
		for (int i = 0; i < bytes.length; i++) {
			
			for (int j = 0; j < 4; j++) {
				bytes[i][j] = (char) ((num[i] >> 32-(8*(j+1))) & 0xFF);
			}
		}
		int R = 256;
		
		int[] aux = new int[N];
		for (int d = 3; d >= 0; d--) {
			int[] count = new int[R + 1];
			for (int i = 0; i < N; i++){
				count[bytes[i][d] + 1]++;
			}
			
			for (int r = 0; r < R; r++){
				count[r + 1] += count[r];
			}
			
			for (int i = 0; i < N; i++){
				aux[count[bytes[i][d]]++] = num[i];
			}
			
			for (int i = 0; i < N; i++){
				num[i] = aux[i];
			}
			
		}
	}
}
