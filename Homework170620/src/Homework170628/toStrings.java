package Homework170628;

public class toStrings {

	public static String toBinaryString(int a) {
		String s = "";
		do {	
			s=a % 2 + s;
			a=a / 2;
			
		} while (a>=1);
		
		return s;
	}
	
	public static String toHexString(int a) {
		String s = "";
		do {	
			
			if (a % 16 > 9) {
				s=(char)((int)'A'-10+a % 16) + s;
				
			}
			else {
				s=a % 16 + s;
				}
			a=a / 16;
			
		} while (a>=1);
		
		return s;
	}
	
	public static String toOctalString(int a) {
		String s = "";
		do {	
			s=a % 8 + s;
			a=a / 8;
			
		} while (a>=1);
		
		return s;
	}

}
