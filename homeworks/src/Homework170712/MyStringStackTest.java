package Homework170712;
import mytestframework.SimpleUnit;
public class MyStringStackTest {

	public static void main(String[] args) {
		
		// pop
		// tos
		// push
		MyStringStack stack = new MyStringStack();
		
		System.out.println(SimpleUnit.assertEquals(stack.push("one"), true));
		System.out.println(SimpleUnit.assertEquals(stack.push("two"), true));
		System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
		System.out.println(SimpleUnit.assertEquals(stack.push("three"), false));
		
		System.out.println(SimpleUnit.assertEquals(stack.pop(), "three"));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), "two"));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), "one"));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), ""));
		
		System.out.println(SimpleUnit.assertNotEquals(stack.push("two"), false));
		System.out.println(SimpleUnit.assertNotEquals(stack.push("three"), false));
		
		System.out.println(SimpleUnit.assertEquals(stack.tos(), "three"));
		System.out.println(SimpleUnit.assertNotEquals(stack.tos(), "two"));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), "three"));
		System.out.println(SimpleUnit.assertEquals(stack.tos(), "two"));
		
	}
	
}
