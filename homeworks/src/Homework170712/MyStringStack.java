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

	public boolean pop() {
		// FIXME Auto-generated method stub
		return false;
	}

	public boolean tos() {
		// FIXME Auto-generated method stub
		return false;
	}

}
