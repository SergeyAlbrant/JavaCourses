package Homework170624;

import mytestframework.SimpleUnit;

public class ModTest {
	
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(MathUtils.mod(10,5), 0));
		System.out.println(SimpleUnit.assertEquals(MathUtils.mod(14,5), 4));
		System.out.println(SimpleUnit.assertEquals(MathUtils.mod(1,2), 1));
		System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-7,3), -1));

		System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(14,5), 35));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(1,2), 4));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(-7,3), -2));
	}

}
