package Homework170710;

public class UseStringLinkedList {
	
	public static void main(String[] args) {
		
		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		
		
		System.out.println(list.remove(2));
		System.out.println(list);
		

	}

}