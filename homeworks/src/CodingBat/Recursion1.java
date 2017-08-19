package CodingBat;

public class Recursion1 {
	
	public static int factorial(int n) {
		  if (n==1)  return 1;
		  return n*factorial(n-1);
		}

	
	public static int bunnyEars(int bunnies) {
		  if (bunnies<1)  return 0;
		  return 2+bunnyEars(bunnies-1);
		}

	
	public static int fibonacci(int n) {
		  if (n==0)  return 0;
		  if (n==1)  return 1;
		  return fibonacci(n-2)+fibonacci(n-1);
		}

	
	public static int bunnyEars2(int bunnies) {
		  if (bunnies<1)  return 0;
		  if (bunnies%2==0) return 3+bunnyEars2(bunnies-1);
		  else return 2+bunnyEars2(bunnies-1);
		  
		}

	
	public static int triangle(int rows) {
		  if (rows<1) return 0;
		  return rows+triangle(rows-1);
		}

	
	public static int sumDigits(int n) {
		  if (n<1) return 0;
		  return n%10 + sumDigits(n/10);
		}

	
	public static int count7(int n) {
		  if (n<1) return 0;
		  if (n%10 == 7) return 1 + count7(n/10);
		  else return 0 + count7(n/10);
		}

	
	public static int count8(int n) {
		  if (n<1) return 0;
		  if (n%10 == 8 && (n/10)%10 == 8 ) return 2 + count8(n/10);
		  else if (n%10 == 8) return 1 + count8(n/10);
		  else return 0 + count8(n/10);
		}

	
	public static int powerN(int base, int n) {
		  if (n<1) return 1;
		  return base * powerN(base, n-1);
		}

	
	public static int countX(String str) {
		  if (str.length()<1) return 0;
		  if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
		  else return 0 + countX(str.substring(1));
		}

	
	public static int countHi(String str) {
		  if (str.length()<2) return 0;
		  if (str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(1));
		  else return 0 + countHi(str.substring(1));
		}

	
	public static String changeXY(String str) {
		  if (str.length()==0) return "";
		  if (str.charAt(0) == 'x') return 'y' + changeXY(str.substring(1));
		  else return str.charAt(0) + changeXY(str.substring(1));
		}

	
	public static String changePi(String str) {
		  if (str.length()<2) return str;
		  if (str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
		  else return str.charAt(0) + changePi(str.substring(1));
		}

	
	public static String noX(String str) {
		  if (str.length()==0) return "";
		  if (str.charAt(0) == 'x') return noX(str.substring(1));
		  else return str.charAt(0) + noX(str.substring(1));
		}

	
	public static boolean array6(int[] nums, int index) {
		  if (nums.length<=index) return false;
		  if (nums[index] == 6) return true;
		  else return array6(nums, index+1);
		}

	
	public static int array11(int[] nums, int index) {
		  if (nums.length<=index) return 0;
		  if (nums[index] == 11) return 1+array11(nums, index+1);
		  else return array11(nums, index+1);
		}

	
	public static boolean array220(int[] nums, int index) {
		  if (nums.length-1<=index) return false;
		  if (10*nums[index] == nums[index+1]) return true;
		  else return array220(nums, index+1);
		}

	
	public static String allStar(String str) {
		  if (str.length()<2) return str;
		  return str.charAt(0) + "*" + allStar(str.substring(1));
		}

	
	public static String pairStar(String str) {
		  if (str.length()<2) return str;
		  if(str.charAt(0)==str.charAt(1)) {
		    return str.charAt(0) + "*" + pairStar(str.substring(1));
		  }
		  else return str.charAt(0) + pairStar(str.substring(1));
		}

	
	public static String endX(String str) {
		  if (str.length()<2) return str;
		  if(str.charAt(0)=='x') {
		    return endX(str.substring(1)) + str.charAt(0);
		  }
		  else return str.charAt(0) + endX(str.substring(1));
		}

	
	public static int countPairs(String str) {
		  if (str.length()<3) return 0;
		  if(str.charAt(0)==str.charAt(2)) {
		    return 1 + countPairs(str.substring(1));
		  }
		  else return countPairs(str.substring(1));
		}

	
	public static int countAbc(String str) {
		  if (str.length()<3) return 0;
		  if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")) {
		    return 1 + countAbc(str.substring(2));
		  }
		  else return  countAbc(str.substring(1));
		}

	
	public static int count11(String str) {
		  if (str.length()<2) return 0;
		  if(str.substring(0,2).equals("11")) {
		    return 1 + count11(str.substring(2));
		  }
		  else return  count11(str.substring(1));
		}

	
	public static String stringClean(String str) {
		  if (str.length()<2) return str;
		  if(str.charAt(0)==str.charAt(1)) {
		    return stringClean(str.substring(1));
		  }
		  else return  str.charAt(0) + stringClean(str.substring(1));
		}

	
	public static int countHi2(String str) {
		  if (str.length()<2) return 0;
		  
		  if (str.charAt(0)=='x' && str.charAt(1)=='h') return countHi2(str.substring(2));
		  
		  if (str.substring(0,2).equals("hi")) {
		    return 1 + countHi2(str.substring(2));
		  }
		  else return countHi2(str.substring(1));
		}

	
	public static String parenBit(String str) {
		  if (str.length()<1) return str;
		  
		  if(str.charAt(0)=='(') {
		    if (str.charAt(str.length()-1) == ')'){
		      return str;
		    }
		    else return parenBit(str.substring(0,str.length()-1));
		  }
		  else return  parenBit(str.substring(1));
		}

	
	public static boolean nestParen(String str) {
		  if (str.length()==1 && (str.charAt(0)!='('&& str.charAt(0)!=')')) return true;
		  if (str.length()<1) return true;
		  
		  if(str.charAt(0)=='(' && str.charAt(str.length()-1) == ')') {
		      return nestParen(str.substring(1,str.length()-1));
		  }
		  else return false;
		}

	
	public static int strCount(String str, String sub) {
		  
		  if (str.length()<sub.length()) return 0;
		  
		  if (str.substring(0,sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
		  else return strCount(str.substring(1), sub);
		  
		}

	
	public static boolean strCopies(String str, String sub, int n) {
		  
		  if (str.length()<sub.length()) {
		    if (n<=0) return true;
		    else return false;
		  }
		  
		  if (str.substring(0,sub.length()).equals(sub)) return strCopies(str.substring(1), sub, n-1);
		  else return strCopies(str.substring(1), sub, n);
		  
		}

	
	public static int strDist(String str, String sub) {
		  if (str.length()<sub.length()) return 0;
		  
		  if (str.substring(0,sub.length()).equals(sub)) {
		    if (str.substring(str.length()-sub.length()).equals(sub)){
		      return str.length();
		    }
		    else return strDist(str.substring(0,str.length()-1),sub);
		  }
		  else return  strDist(str.substring(1),sub);
		}

	
	

}
