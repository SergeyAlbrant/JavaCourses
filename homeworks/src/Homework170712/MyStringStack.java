package Homework170712;

import java.util.Arrays;

public class MyStringStack {

	
	
	private static final int MAX_STACK_SIZE = 3;
	private String[] arr;
	int size;

	public MyStringStack(int i) {
		arr = new String[i];
	}

	public MyStringStack() {
		this(MAX_STACK_SIZE);
	}

	public boolean push(String string) {
		
		if (size>=arr.length) return false;
		
		arr[size++]=string;
		
		return true;
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(Arrays.copyOfRange(arr, 0, size));
	}

	public String pop() {
		if (size<=0){
			return "";
		}
		String res = arr[--size];
		arr[size]=null;
		return res;
	}

	public String tos() {
		return (size<=0) ? "" : arr[size-1];
	}

}
