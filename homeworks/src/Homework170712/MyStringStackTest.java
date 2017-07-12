package Homework170712;
import mytestframework.SimpleUnit;
public class MyStringStackTest {

	public static void main(String[] args) {
		
		// pop
		// tos
		// push
		MyStringStack stack = new MyStringStack();
		
		System.out.println(SimpleUnit.assertEquals(stack.push("one"), true));
		System.out.println(SimpleUnit.assertEquals(stack.push(""), true));
		System.out.println(SimpleUnit.assertEquals(stack.push("two"), true));
		System.out.println(SimpleUnit.assertEquals(stack.push("three"), false));
		
		System.out.println(SimpleUnit.assertEquals(stack.pop(), true));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), true));
		
		System.out.println(SimpleUnit.assertEquals(stack.tos(), true));
		System.out.println(SimpleUnit.assertEquals(stack.tos(), true));
		System.out.println(SimpleUnit.assertEquals(stack.tos(), true));
		
	}
	
}
