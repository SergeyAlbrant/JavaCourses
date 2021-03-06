package Homework170710;

public class StringLinkedList {
	
	Node first;  // null
	
	Node last;  // null

	int size;  // 0
	
	public void add(String value) {
		Node node = new Node(value, null);
		
		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}

		last = node;
		
		size++;
	}
	
	public boolean remove(String value) {
		
		boolean result = false;
		
		Node current = first;
		
		Node prev = null;
		
		while (current != null) {
			if (current.value.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}
		
		if (first == null) {
			last = null;
		}
		
		return result;
	}
	
	public String remove(int index) {
		// TODO  Home work
		int counter=0;
		Node current = first;
		String result = "";
		Node prev = null;
		
		while (current != null) {
			if (counter==index) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = current.value;
				break;
			}
			prev = current;
			current = current.next;
			counter++;
		}
		
		if (first == null) {
			last = null;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		// traverse 
		StringBuilder sb = new StringBuilder("[");
		//String result = "[";

		if (first != null) {
			sb.append(first.value);
			//result += first.value;
			
			Node current = first.next;
			
			while (current != null) {
				sb.append(", ").append(current.value);
				
				//result += ", " + current.value;
				current = current.next;
			}
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}