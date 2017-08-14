package Homework170812;

public class BinarySearch {
	
	public static int binarySearch(int[] a, int key){
		int lo = 0;
		int hi = a.length-1;
		int mid = -1000;
		while (lo <= hi){
			mid = lo + (hi-lo)/2;
			//System.out.println(mid);
			if (key<a[mid]) hi = mid - 1;
			else if (key>a[mid]) lo = mid + 1;
			else return mid;
		}
		
		if (key<a[mid]) return -mid;
		else return -mid-1;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 8, 34};
		System.out.println(binarySearch(a, 7));
		System.out.println(binarySearch(a, 8));
		System.out.println(binarySearch(a, 9));
	}
}
