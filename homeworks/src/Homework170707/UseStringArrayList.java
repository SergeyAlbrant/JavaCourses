package Homework170707;

public class UseStringArrayList {

	public static void main(String[] args) {
		
		StringArrayList list = new StringArrayList();
		
		list.add("one");
		
		System.out.println(list);
		
		list.add("two");
		
		System.out.println(list);

		list.remove(0);
		list.remove(0);
		
		System.out.println(list);
		
		list.add("three");
		
		System.out.println(list);
		
		list.add("four");
		list.add("five");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		list.set(1,"fi");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.remove("fi");
		System.out.println(list);
		
		
	}
	
}
