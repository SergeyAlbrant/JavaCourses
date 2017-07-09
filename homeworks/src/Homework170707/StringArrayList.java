package Homework170707;

import java.util.Arrays;

public class StringArrayList {

static final int DEFAULT_SIZE = 2;
	
	String[] elements = new String[DEFAULT_SIZE];
	
	//  [a,b,c,d,e,f]
	//   0 1 2 3 4 5
	
	int size = 0;

	public void add(String string) {
		
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		
		elements[size++] = string;
//		size = size + 1;
	}
	
	@Override
	public String toString() {

		String r = "[";
		
		if (elements.length > 0) {
			if (elements[0]!=null) r += elements[0];
			for (int i = 1; i < elements.length; i++) {
				if (elements[i]!=null){
				r += ", " + elements[i];
				}
			}
		}
		
		r += "]";
		
		return r;
		
	}
	
	//  [a,b,c,d,e,_]
	//   0 1 2 3 4 5
	//  [a,b,d,e,_,_]
	//   0 1 2 3 4 

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}
		
		System.arraycopy(elements, i+1, elements, i, --size - i);
		elements[size] = null;
		
	}

	public String get(int index) {
		if (index >= size || index < 0) {
			return "";
		}
		return elements[index];
	}

	public void set(int index, String st) {
		if (index >= size || index < 0) {
			return;
		}
		elements[index]=st;
		
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size==0);
	}

	public void remove(String st) {

		for (int i = 0; i < elements.length; i++) {
			if (elements[i]==st){
				this.remove(i);
			}
		}
		

	}
	
	
	
}
