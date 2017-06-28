package Homework170624;

import mytestframework.SimpleUnit;

public class SignTest {

	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(MathUtils.sign(12), 1));
		System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1));
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MIN_VALUE), -1));
		System.out.println(SimpleUnit.assertEquals(MathUtils.sign(-1), -1));
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.sign(0), 0));
		
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(12), -1));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(12), 0));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-1), 0));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-1), 1));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(Integer.MAX_VALUE), -1));
	

	}

}
