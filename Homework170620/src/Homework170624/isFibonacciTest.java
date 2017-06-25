package Homework170624;

public class isFibonacciTest {
	
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(144), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(143), false));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(4181), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(6765), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(0), true));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(9), false));
		System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(48), false));
		
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(1), false));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(0), false));
		System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(9), true));
		
	}

}
