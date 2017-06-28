package Homework170628;


import mytestframework.SimpleUnit;

public class systems_Test {
	
	public static void main(String[] args) {
		
		System.out.println(SimpleUnit.assertEquals(toStrings.toBinaryString(247), "11110111"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toBinaryString(0), "0"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toBinaryString(1), "1"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toBinaryString(10), "1010"));
		System.out.println(SimpleUnit.assertNotEquals(toStrings.toBinaryString(2), "45"));
		
		
		System.out.println(SimpleUnit.assertEquals(toStrings.toHexString(1), "1"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toHexString(0), "0"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toHexString(17), "11"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toHexString(365), "16D"));
		System.out.println(SimpleUnit.assertNotEquals(toStrings.toHexString(0), "F5"));

		System.out.println(SimpleUnit.assertEquals(toStrings.toOctalString(1), "1"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toOctalString(0), "0"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toOctalString(28), "34"));
		System.out.println(SimpleUnit.assertEquals(toStrings.toOctalString(456), "710"));
		System.out.println(SimpleUnit.assertNotEquals(toStrings.toOctalString(2), "3"));
		
	}
	
}
