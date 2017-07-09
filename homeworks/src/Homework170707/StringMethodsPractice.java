package Homework170707;

import mytestframework.SimpleUnit;

public class StringMethodsPractice {

	public static void main(String[] args) {
		
		String s = "   Hello ";
		String s2 = "Hello";  // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		//             ^1     ^2   
		String s6 = "";
		
		

		System.out.println(SimpleUnit.assertEquals(trim(s6), ""));
		System.out.println(SimpleUnit.assertEquals(trim(s2), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s4), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s3), s2));
		System.out.println(SimpleUnit.assertEquals(trim(s5), "He l l o"));
		
		System.out.println(SimpleUnit.assertEquals(replace(s2,'l','u'), "Heuuo"));
		System.out.println(SimpleUnit.assertEquals(replace(s2,'H','Y'), "Yello"));
		System.out.println(SimpleUnit.assertEquals(replace(s,' ','!'), "!!!Hello!"));
	}

	private static String replace(String s, char old, char cur) {
		
		if (s == null || s.length() == 0) {
			return s;
		}
		
		char[] val = s.toCharArray();

		for (int i = 0; i < val.length; i++) {
			if (val[i]==old){
				val[i]=cur;
			}

		}
		
		return String.valueOf(val);
	}

	private static String trim(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}
		
		if (hasNoTrailingOrLeadingSpaces(s)) {
			return s;
		}
		
		// TODO
		char[] val = s.toCharArray();

		int first=-1, last = -1;
		for (int i = 0; i < val.length; i++) {
			if (val[i]==' '){
				continue;
			}
			else{
				first=i;
				break;
			}
		}
		for (int i = val.length-1; i >= 0; i--) {
			if (val[i]==' '){
				continue;
			}
			else{
				last=i;
				break;
			}
		}
		
		return s.substring(first, last+1);
	}

	private static boolean hasNoTrailingOrLeadingSpaces(String s) {
		return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
	}
	
}
