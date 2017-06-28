package Homework170624;

import mytestframework.SimpleUnit;

public class isPrimeTest {
	
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(10), false));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(55), false));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(14), false));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(1), false));
		
		
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(43), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(79), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(97), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(17), true));

		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(43), false));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(79), false));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(14), true));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(1), true));
		
	}

}
