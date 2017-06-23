package HW;

public class WarmUp2 {
	
	public static void main(String[] args) {
	      
	      System.out.println(stringTimes("Hi", 5));
	      
	     
	   }
	
	public static String stringTimes(String str, int n) {
		  String final_str="";
		  for (int i=0; i<n; i++) {
		    final_str+=str;
		  }
		  return final_str;
		}

	
	public static String frontTimes(String str, int n) {
		  String front="";
		  String res="";
		  if (str.length()<3) front=str;
		  else front=str.substring(0,3);
		  
		  for (int i=0; i<n; i++) {
		    res+=front;
		    
		  }
		  return res;
		}

	
	public static int countXX(String str) {
		  int c=0;
		  for (int i=0; i < str.length()-1; i++) {
		    if (str.charAt(i)=='x' && str.charAt(i+1)=='x') c++;
		  }
		  return c;
		}

	
	public static boolean doubleX(String str) {
		  int check=0;
		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i)=='x' && check==1) return true;
		    if (check==1) return false;
		    if (str.charAt(i)=='x') check=1;
		    else check=0;
		  }
		  return false;
		}

	
	public static String stringBits(String str) {
		  String final_str="";
		  for (int i=0; i<str.length(); i+=2) {
		    final_str+=str.charAt(i);
		  }
		  return final_str;
		}

	
	public static String stringSplosion(String str) {
		  String fin="";
		  for (int i=1; i<=str.length(); i++) {
		    fin+=str.substring(0,i); 
		  }
		  return fin;
		}

	
	public static int last2(String str) {
		  if (str.length()<2) return 0;
		  String last2=str.substring(str.length()-2);
		  int count=0;
		  
		  for (int i=0; i<str.length(); i++) {
		    if ((i+1<str.length() && str.substring(i, i+2).equals(last2))) {
		      count++;
		    }
		  }
		  return count-1;
		}

	
	public static int arrayCount9(int[] nums) {
		  int c=0;
		  for (int i=0; i<nums.length;i++) {
		    if (nums[i]==9) c++;
		  }
		  return c;
		}

	
	public static boolean arrayFront9(int[] nums) {
		  
		  for (int i=0; i<nums.length; i++) {
		    if (i>3) return false;
		    if (nums[i]==9) return true;
		    
		  }
		  return false;
		}

	
	public static boolean array123(int[] nums) {
		  if (nums.length<2) return false;
		  
		  for (int i=0; i<nums.length; i++) {
		    if (i+2<nums.length && nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) {
		     return true;
		    }
		  }
		  
		  return false;
		}

	
	public static int stringMatch(String a, String b) {
		  int c=0;
		  int q;
		  if (a.length()>b.length()) q=b.length();
		  else q=a.length();
		  
		  for (int i=0; i<q-1; i++) {
		    if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
		      c++;
		    }
		  }
		  return c;
		}

	
	public static String stringX(String str) {
		  
		  if (str.length()<3) return str;
		  String fin=str.substring(0,1);
		  for (int i=1; i<str.length()-1; i++) {
		    if (!(str.charAt(i)=='x')) fin+=str.substring(i,i+1);
		  }
		  fin+=str.substring(str.length()-1);
		  return fin;
		  
		}

	
	public static String altPairs(String str) {
		  String res="";
		  if (str.length()<3) return str;
		  for (int i=0; i<str.length(); i+=4) {
		    if (i+1==str.length()) {
		      res=res+str.charAt(i);
		    }
		    else res=res+str.charAt(i)+str.charAt(i+1);
		  }
		  return res;
		}

	
	public static String stringYak(String str) {
		  return str.replaceAll("yak", "");
		}

	
	public static int array667(int[] nums) {
		  
		  int c=0;
		  
		  for (int i=0; i<nums.length-1; i++) {
		    if (nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)) c++;
		  }
		  return c;
		}

	
	public static boolean noTriples(int[] nums) {
		  if (nums.length<3) return true;
		  
		  for (int i=0; i<nums.length-2; i++) {
		    if (nums[i]==nums[i+1] && nums[i+2]==nums[i+1]) {
		     return false;
		    }
		  }
		  
		  return true;
		}

	
	public static boolean has271(int[] nums) {

		  for (int i=0; i < (nums.length-2); i++) {
		    int v = nums[i];
		    if (nums[i+1] == (v+5) && Math.abs(nums[i+2] - (v-1)) <= 2) { 
		        return true;
		    }
		  }

		  return false;
		}

}
