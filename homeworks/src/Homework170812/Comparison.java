package Homework170812;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Comparison {

	private static void fill(Collection<A> a) {
		for (int i = 0; i < 1_000_000; i++) {
			a.add(new A());
		}
	}
	
	public static void main(String[] args) {
		
		List<A> linkedList = new LinkedList<>();
		List<A> arrayList = new ArrayList<>();
		Collection<A> treeSet = new TreeSet<>();
		
		A key = new A();
		System.out.println("Key is: " + key);
		
		
		long globalStart = System.currentTimeMillis();
		
		long start = System.currentTimeMillis();
		fill(linkedList);
		long stop = System.currentTimeMillis();
		System.out.println("Linked List filled in = " + (stop - start));
		
		start = System.currentTimeMillis();
		Collections.sort(linkedList);
		stop = System.currentTimeMillis();
		System.out.println("Linked List sorted in = " + (stop - start));
		
		start = System.currentTimeMillis();
		Collections.binarySearch(linkedList, key);
		stop = System.currentTimeMillis();
		System.out.println("Linked List executed binary search in = " + (stop - start));
		
		long globalStop = System.currentTimeMillis();
		
		System.out.println("Linked List did all operations in = " + (globalStop - globalStart));
		System.out.println();
		

		
		globalStart = System.currentTimeMillis();
		
		start = System.currentTimeMillis();
		fill(arrayList);
		stop = System.currentTimeMillis();
		System.out.println("Array List filled in = " + (stop - start));
		
		start = System.currentTimeMillis();
		Collections.sort(arrayList);
		stop = System.currentTimeMillis();
		System.out.println("Array List sorted in = " + (stop - start));
		
		start = System.currentTimeMillis();
		Collections.binarySearch(arrayList, key);
		stop = System.currentTimeMillis();
		System.out.println("Array List executed binary search in = " + (stop - start));
		
		globalStop = System.currentTimeMillis();
		
		System.out.println("Array List did all operations in = " + (globalStop - globalStart));
		System.out.println();
		
		
		globalStart = System.currentTimeMillis();
		
		start = System.currentTimeMillis();
		fill(treeSet);
		stop = System.currentTimeMillis();
		System.out.println("Tree Set filled in = " + (stop - start));
		
		start = System.currentTimeMillis();
		System.out.println(treeSet.contains(key));
		stop = System.currentTimeMillis();
		System.out.println("Tree Set executed binary search in = " + (stop - start));
		
		globalStop = System.currentTimeMillis();
		
		System.out.println("Tree Set did all operations in = " + (globalStop - globalStart));

		
//		System.out.println(list);
//		
//		A key = new A();
//		System.out.println(key);
//		
//		int index = Collections.binarySearch(list, key);
//		
//		System.out.println(index);
//		
//		Collections.sort(list);
//		
//		System.out.println(list);
//		
//		index = Collections.binarySearch(list, key);
//		
//		System.out.println(index);
		
	}
	
}


class A implements Comparable<A> {
	static Random r = new Random(5);
	int x = r.nextInt(1000000);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}
	
	
	
}