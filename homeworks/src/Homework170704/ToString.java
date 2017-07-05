package Homework170704;

import java.util.Arrays;

public class ToString {

	public static void main(String[] args) {
		
		int[] ar = {4, 3, 78, 5, 798, 45};
		int[] ar2 = {};
	
		
		System.out.println(Arrays.toString(ar));
		makeString(ar);
		
		System.out.println(Arrays.toString(ar2));
		makeString(ar2);
		
		
	}

	public static void makeString(int[] array) {
		
		if (array.length==0) {
			System.out.println("[]");
			return;
		}
		
		
		String s = "[";
		for (int i = 0; i < array.length-1; i++) {
			s+=array[i]+", ";
		}
		s+=array[array.length-1]+"]";
		
		
		System.out.println(s);
	}
}
