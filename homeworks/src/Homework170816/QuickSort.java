package Homework170816;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
	
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] {4, 7, 9, 6 , 234 , 85 ,98 ,34});
		sort(a);
		System.out.println(a);
	}

	public static void sort(List<Integer> a) {
		Collections.shuffle(a);
		sort(a, 0, a.size()-1);
	}

	private static void sort(List<Integer> a, int lo, int hi) {
		if (lo>=hi) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
		
		
	}

	private static int partition(List<Integer> a, int lo, int hi) {
		int i = 0;
		int j = hi+1;
		while (true){
			while(a.get(lo)>a.get(++i)){
				if (i==hi) break;
			}
			
			while(a.get(lo)<a.get(--j)){
				if (j==lo) break;
			}
			if (j<=i) break;
			Collections.swap(a, i, j);
		}
		Collections.swap(a, lo, j);
		return j;
	}
	

}
