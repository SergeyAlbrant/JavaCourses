package CodingBat;

public class WarmUp1 {
	
	public static void main(String[] args) {
	      
	      System.out.println(sleepIn(false, false));
	      
	     
	   }
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  
		  if (weekday==false || vacation==true){
		    return true;
		  }
		  else {
		    return false;
		  }
		  
		}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  return (aSmile && bSmile) || (!aSmile && !bSmile);
		}

	public static int sumDouble(int a, int b) {
		  if (a==b) return 2*(a+b);
		  else return a+b;
		}

	public static int diff21(int n) {
		  if (n>=21) {
		    return 2*Math.abs(21-n);
		  }
		  else {
		    return Math.abs(21-n);
		  }
		}

	
	public static boolean parrotTrouble(boolean talking, int hour) {
		  return ((hour<7) || (hour>20)) && talking;
		}

	
	public static boolean makes10(int a, int b) {
		  return (a==10 || b==10 || a+b==10);
		}

	
	public static boolean nearHundred(int n) {
		  if (Math.abs(100-n)<=10 || Math.abs(200-n)<=10) {
		    return true;
		  }
		  else {
		    return false;
		  }
		}

	
	public static boolean posNeg(int a, int b, boolean negative) {
		  if (negative) {
		    if (a<0 && b<0) return true;
		    else return false;
		  }
		  else {
		    if ((a<0 && b>0) || (a>0 && b<0)) return true;
		    else return false;
		  }
		}

	
	public static String notString(String str) {
		  if (str.length()>2) {
		    if (str.substring(0,3).equals("not")) return str;
		  }
		  return "not "+str;

		}

	
	public static String missingChar(String str, int n) {
		  return str.substring(0,n) + str.substring(n+1,str.length());
		}

	
	public static String frontBack(String str) {
		  if (str.length()>1) {
		    return str.substring(str.length()-1)+str.substring(1,str.length()-1)+str.substring(0,1);
		  }
		    
		  else {
		    return str;
		  }
		  
		  }

	
	public static String front3(String str) {
		  String front="";
		  if (str.length()<3) return str+str+str;
		  front=str.substring(0,3);
		  return front+front+front;
		}

	
	public static String backAround(String str) {
		  if (str.length()>0) {
		    return str.substring(str.length()-1)+str+str.substring(str.length()-1);
		  }
		  else{
		    return str;
		  }
		}

	
	public static boolean or35(int n) {
		  if (n % 3 ==0 || n % 5 ==0) {
		    return true;
		  }
		  else return false;
		}

	
	public static String front22(String str) {
		  String front="";
		  if (str.length()<2) return str+str+str;
		  front=str.substring(0,2);
		  return front+str+front;
		}

	
	public static boolean startHi(String str) {
		  if (str.length()>1) {
		    if (str.substring(0,2).equals("hi")) {
		      return true;
		    }
		    else {
		      return false;
		    }
		  }
		  else {
		    return false;
		  }
		}

	
	public static boolean icyHot(int temp1, int temp2) {
		  if ((temp1>100 && temp2<0) || (temp2>100 && temp1<0)) {
		    return true;
		  }
		  else return false;
		}

	
	public static boolean in1020(int a, int b) {
		  if ((a>=10 && a<=20) || (b>=10 && b<=20)) return true;
		  else return false;
		  
		}

	
	public static boolean hasTeen(int a, int b, int c) {
		  if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) {
		    return true;
		  }
		  else {
		    return false;
		  }
		}

	
	public static boolean loneTeen(int a, int b) {
		  if (((a>=13 && a<=19) && (b<13 || b>19)) || ((b>=13 && b<=19) && (a<13 || a>19))) {
		    return true;
		  }
		  else return false;
		  
		}

	
	public static String delDel(String str) {
		  if (str.length()>3 && str.substring(1,4).equals("del")) {
		    return str.substring(0,1)+str.substring(4);
		  }
		  else return str;
		}

	
	public static boolean mixStart(String str) {
		  if (str.length()>2) {
		    if (str.substring(1,3).equals("ix")) {
		      return true;
		    }
		    else {
		      return false;
		    }
		  }
		  else {
		    return false;
		  }	  
		}

	
	public static String startOz(String str) {
		  if (str.length()>1) {
		    
		    if (str.substring(0,2).equals("oz")) {
		      return "oz";
		    }
		    
		    if (str.substring(0,1).equals("o")) {
		      return "o";
		    }
		    
		    if (str.substring(1,2).equals("z")) {
		      return "z";
		    }
		    return "";
		    
		  }
		  else return str;
		}

	
	public static int intMax(int a, int b, int c) {
		  if ((a>=b)&&(a>=c)) return a;
		  if ((b>=c)&&(b>=a)) return b;
		  else return c;
		}

	
	public static int close10(int a, int b) {
		  int x=Math.abs(10-a);
		  int y=Math.abs(10-b);
		  
		  if (x==y){
		    return 0;
		  }
		  
		  if (x<y){
		    return a;
		  }
		  else {
		    return b;
		  }
		}

	
	public static boolean in3050(int a, int b) {
		  if ((a>=30 && a<=40 && b>=30 && b<=40) || (a>=40 && a<=50 && b>=40 && b<=50)) {
		    return true;
		  }
		  else return false;
		  
		}

	
	public static int max1020(int a, int b) {
		  if ((a>=10 & a<=20) && (b>=10 & b<=20)) {
		    if (a>b) return a;
		    else return b;
		  }
		  if (a>=10 & a<=20) return a;
		  if (b>=10 & b<=20) return b;
		  return 0;
		}

	
	public static boolean stringE(String str) {
		  
		  int c = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i)==('e')) {
		      c++;
		    }
		  }

		  return (c >= 1 && c <= 3);
		  
		}

	
	public static boolean lastDigit(int a, int b) {
		  if (a % 10 == b % 10) {
		    return true;
		  }
		  else return false;
		}

	
	public static String endUp(String str) {
		  if (str.length()>2) return str.substring(0,str.length()-3)+str.substring(str.length()-3).toUpperCase();
		  else return str.toUpperCase();
		  
		}

	
	public static String everyNth(String str, int n) {
		  String str1="";
		  for (int i = 0; i < str.length(); i += n) {
		    str1+=str.charAt(i);
		  }
		  return str1;
		  
		}

}

