package Homework170706;

public class String1 {
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static String helloName(String name) {
		  return "Hello "+name+"!";
		}

	
	public static String makeAbba(String a, String b) {
		  
		  return a+b+b+a;
		  
		}

	
	public static String makeTags(String tag, String word) {
		  return "<"+tag+">"+word+"</"+tag+">";
		}

	
	public static String makeOutWord(String out, String word) {
		  return out.substring(0, 2)+word+out.substring(2, 4);
		}

	
	public static String extraEnd(String str) {
		  String res = str.substring(str.length()-2, str.length());
		  return res+res+res;
		}

	
	public static String firstTwo(String str) {
		  
		  if (str.length()<2) return str;
		  
		  return str.substring(0,2);
		  
		  
		}

	
	public static String firstHalf(String str) {
		  return str.substring(0,str.length()/2);
		}

	
	public static String withoutEnd(String str) {
		  
		  return str.substring(1,str.length()-1);
		  
		}

	
	public static String comboString(String a, String b) {
		  
		  if (a.length()>b.length()) return b+a+b;
		  return a+b+a;
		  
		}

	
	public static String nonStart(String a, String b) {
		  
		  return a.substring(1)+b.substring(1);
		  
		}

	
	public static String left2(String str) {
		  return str.substring(2)+str.substring(0,2);
		}

	
	public static String right2(String str) {
		  return str.substring(str.length()-2)+str.substring(0,str.length()-2);
		}

	
	public static String theEnd(String str, boolean front) {
		  if (front) return str.substring(0,1);
		  return str.substring(str.length()-1);
		}

	
	public static String withouEnd2(String str) {
		  
		  if (str.length()<2) return "";
		  
		  return str.substring(1, str.length()-1);
		  
		}

	
	public static String middleTwo(String str) {
		  return str.substring(str.length()/2-1,str.length()/2+1);
		}

	public static boolean endsLy(String str) {
		  
		  if (str.length()<2) return false;
		  
		  return (str.substring(str.length()-2,str.length()).equals("ly"));
		  
		}

	
	public static String nTwice(String str, int n) {
		  return str.substring(0,n) + str.substring(str.length()-n);
		}

	
	public static String twoChar(String str, int index) {
		  
		  if (str.length()-index<2 || index<0) return str.substring(0,2);
		  
		  return str.substring(index,index+2);
		  
		}

	
	public static String middleThree(String str) {
		  
		  return str.substring(str.length()/2-1,str.length()/2+2);
		  
		}

	
	public static boolean hasBad(String str) {
		  if (str.length()<3) return false;
		  if (str.length()==3) return str.substring(0,3).equals("bad");
		  
		  return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
		}

	
	public static String atFirst(String str) {
		  if (str.length()==0) return "@@";
		  if (str.length()==1) return str+"@";
		  
		  return str.substring(0,2);
		  
		}

	
	public static String lastChars(String a, String b) {
		  
		  String s2 = "";
		  String s1 = "";
		  
		  if (a.length() == 0) s1="@";
		  else s1=a.substring(0,1);
		  
		  if (b.length() == 0) s2="@";
		  else s2=b.substring(b.length()-1);
		  
		  return s1+s2;
		  
		}

	
	public static String conCat(String a, String b) {
		  
		  if (a.length()<1 || b.length()<1) return a+b;
		  
		  if (a.substring(a.length()-1).equals(b.substring(0,1))){
		    return a+b.substring(1);
		  }
		  
		  return a+b;
		}

	
	public static String lastTwo(String str) {
		  
		  if (str.length()<2) return str;
		  
		  return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
		  
		}

	
	public static String seeColor(String str) {
		  
		  if (str.length()<3) return "";
		  
		  if (str.substring(0,3).equals("red")) return "red";
		  if (str.length()>3 && str.substring(0,4).equals("blue")) return "blue";
		  
		  return "";
		}

	
	public static boolean frontAgain(String str) {
		  
		  if (str.length()<2) return false;
		  
		  return str.substring(0,2).equals(str.substring(str.length()-2));
		  
		}

	
	public static String minCat(String a, String b) {



		  if (a.length()<b.length()){
		    return a+b.substring(b.length()-a.length());
		  }
		  else if (a.length()>b.length()){
		    return a.substring(a.length()-b.length())+b;
		  }
		  return a+b;
		  
		}

	
	public static String extraFront(String str) {
		  String res;
		  
		  if (str.length()<2) res=str;
		  else res=str.substring(0, 2);
		  
		  return res+res+res;
		  
		}

	
	public static String without2(String str) {
		  
		  if (str.length()<2) return str;
		  
		  if (str.substring(0,2).equals(str.substring(str.length()-2))) {
		    return str.substring(2);
		  }
		  
		  return str;
		}
		  

	
	public static String deFront(String str) {    
		  
		  if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b")) return str;
		  
		  if (str.substring(0,1).equals("a") ) return str.substring(0,1)+str.substring(2);
		  if (str.substring(1,2).equals("b") ) return str.substring(1);
		  
		  return str.substring(2);
		  
		}

	
	public static String startWord(String str, String word) {
		  
		  if (str.length()<word.length()) return "";
		  
		  if (str.substring(0,word.length()).equals(word)){
		    return word;
		  }
		  if (str.substring(1,word.length()).equals(word.substring(1))){
		    return str.substring(0,word.length());
		  }
		  
		  return "";
		  
		}

	
	public static String withoutX(String str) {
		  
		  if (str.length()<1 || str.equals("x")) return "";
		  if (str.length()==1) return str;

		  if (str.substring(0,1).equals("x")){
		    str=str.substring(1);
		  }
		  if (str.substring(str.length()-1).equals("x")){
		    str=str.substring(0,str.length()-1);
		  }
		  return str;
		}

	
	public static String withoutX2(String str) {
		  
		  if (str.length()<1 || str.equals("x")) return "";
		  if (str.length()==1) return str;
		  
		  if (str.substring(0,2).equals("xx")) return str.substring(2);
		  
		  if (str.substring(0,1).equals("x")){
		    return str.substring(1);
		  }
		  
		  if (str.substring(1,2).equals("x")){
		    return str.substring(0,1)+str.substring(2);
		  }
		  
		  return str;
		  
		}

	

}
