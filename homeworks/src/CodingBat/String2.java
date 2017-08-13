package CodingBat;

public class String2 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("hey"));;
		
	}
	
	public static String doubleChar(String str) {
		  StringBuilder res = new StringBuilder();
		  
		  for (int i=0; i<str.length(); i++){
		    res.append(str.charAt(i));
		    res.append(str.charAt(i));
		  }
		  return res.toString();
		}

	
	public static int countHi(String str) {
		  
		  int counter=0;
		  
		  for (int i=0; i<str.length()-1; i++){
		    if (str.substring(i,i+2).equals("hi")){
		      counter++;
		      i++;
		    }
		    
		  }
		  return counter;
		}

	public static boolean catDog(String str) {
		  
		  int dog_counter=0;
		  int cat_counter=0;
		  
		  for (int i=0; i<str.length()-2; i++){
		    if (str.substring(i,i+3).equals("cat")){
		      cat_counter++;
		    }
		    if (str.substring(i,i+3).equals("dog")){
		      dog_counter++;
		    }
		    
		  }
		  return (cat_counter==dog_counter);
		  
		}

	
	public static int countCode(String str) {
		  
		  int counter=0;
		  
		  for (int i=0; i<str.length()-3; i++){
		    if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
		      counter++;
		    }
		  }
		  return counter;
		  
		}

	
	public static boolean endOther(String a, String b) {
		  

		  if (a.length()>b.length()) {
		    a=a.substring(a.length() - b.length());
		  }
		  else b=b.substring(b.length() - a.length());
		  

		  return (a.toLowerCase().equals(b.toLowerCase()));
		  
		}

	
	public static boolean xyzThere(String str) {
		  
		  for (int i=0; i<str.length()-2; i++){
		    if (str.charAt(i)=='.'){
		      i+=1;
		      continue;
		    }
		    
		    if (str.charAt(i)=='x' && str.charAt(i+1)=='y' && str.charAt(i+2)=='z'){
		      return true;
		    }
		  }
		  return false;
		  
		}

	
	public static boolean bobThere(String str) {
		  
		  for (int i=0; i<str.length()-2; i++){
		    
		    if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
		      return true;
		    }
		  }
		  return false;
		  
		}

	
	public static boolean xyBalance(String str) {
		  boolean flag = false;
		  for (int i=0; i<str.length(); i++){
		    if (str.charAt(i)=='x'){
		     flag=true;
		    }
		    
		    if (str.charAt(i)=='y' && flag){
		      flag=false;
		    }
		  }
		  return !flag;
		  
		}

	
	public static String mixString(String a, String b) {
		  
		  StringBuilder res = new StringBuilder();
		  for (int i=0; i<Math.min(a.length(),b.length()); i++){
		    res.append(a.charAt(i));
		    res.append(b.charAt(i));
		  }
		  if (a.length()>b.length()) {
		    res.append(a.substring(b.length()));
		  }
		  if (a.length()<b.length()) {
		    res.append(b.substring(a.length()));
		  }
		  
		  return res.toString();
		  
		}

	public static String repeatEnd(String str, int n) {
		  
		  StringBuilder res = new StringBuilder();
		  
		  for (int i=0; i<n; i++){
		    res.append(str.substring(str.length()-n));
		  }
		  
		  return res.toString();
		  
		}

	
	public static String repeatFront(String str, int n) {
		  
		  StringBuilder res = new StringBuilder();
		  
		  for (int i=n; i>0; i--){
		    res.append(str.substring(0, i));
		  }
		  
		  return res.toString();
		}

	
	public static String repeatSeparator(String word, String sep, int count) {
		  
		  if (count==0) return "";
		  
		  StringBuilder res = new StringBuilder();
		  
		  for (int i=0; i<count-1; i++){
		    res.append(word).append(sep);
		  }
		  
		  return res.append(word).toString();
		  
		}

	public static boolean prefixAgain(String str, int n) {
		  
		  for (int i=n; i<str.length()-n+1; i++){
		    if (str.substring(i, i+n).equals(str.substring(0, n))) {
		      return true;
		    }
		  }
		  
		  return false;
		  
		}

	
	public static boolean xyzMiddle(String str) {

		  
		  for (int i=0; i<str.length()-2; i++){
		    if (str.substring(i, i+3).equals("xyz") && Math.abs(str.substring(0, i).length()-str.substring(i+3).length())<2) {
		      return true;
		    }
		    
		  }
		  
		  return false;
		}

	
	public static String getSandwich(String str) {
		  
		  int first = -1;
		  int last = -1;
		  
		  for (int i=0; i<str.length()-4; i++){
		    if (str.substring(i, i+5).equals("bread")) {
		      if (first>=0) {
		        last=i;
		      }
		      else first=i;
		    }
		    
		  }
		  
		  return (last>=0  && first>=0) ? str.substring(first+5, last) : "";
		  
		}

	
	public static boolean sameStarChar(String str) {
		  
		  for (int i=1; i<str.length()-1; i++){
		    if (str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) {
		      return false;
		    }
		  }
		  
		  return true;
		  
		}

	
	public static String oneTwo(String str) {
		  
		  StringBuilder res = new StringBuilder();

		  
		  for (int i=0; i<str.length()-(str.length()%3); i+=3){
		    res.append(str.substring(i+1,i+3));
		    res.append(str.substring(i,i+1));
		  }
		  
		  return res.toString();
		  
		}

	
	public static String zipZap(String str) {
		  
		  StringBuilder res = new StringBuilder();
		  
		  if (str.length()<3){
		    return str;
		  }
		  
		  for (int i=0; i<str.length()-2; i++){
		    
		    res.append(str.charAt(i));
		    
		    if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
		      res.append(str.charAt(i+2));
		      i+=2;
		    }
		    if (str.charAt(i)!='z' && i==str.length()-3){
		      res.append(str.substring(i+1));
		    }
		    
		  }
		  
		  return res.toString();
		  
		}

	
	public static String starOut(String str) {
		  
		  StringBuilder res = new StringBuilder();
		  
		  if (str.length()==0 || str.length()==1 && str.charAt(0)!='*') return str;
		  
		  if ((str.charAt(0)!='*' && str.charAt(1)!='*')){
		     res.append(str.charAt(0));
		  }
		  
		  for (int i=1; i<str.length()-1; i++){
		    
		     if (str.charAt(i)!='*' && str.charAt(i-1)!='*' && str.charAt(i+1)!='*') {
		     res.append(str.charAt(i));
		    }
		    
		  }
		  
		  if ((str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*')){
		     res.append(str.charAt(str.length()-1));
		  }
		  
		  
		  return res.toString();
		  
		}

	
	public static String plusOut(String str, String word) {
		  
		  StringBuilder res = new StringBuilder();
		  boolean flag = false;

		  for (int i=0; i<str.length()-word.length()+1; i++){

		    if (str.substring(i,i+word.length()).equals(word)){
		      if (i==str.length()-word.length()) flag=true;
		      res.append(word);
		      i+=word.length()-1;
		    }
		    else res.append("+");
		  }
		  if (!flag){
		    for (int i=str.length()-word.length()+1; i<str.length(); i++){
		      res.append("+");
		    }
		  }
		  
		  return res.toString();
		  
		}

	
	public static String wordEnds(String str, String word) {
		  StringBuilder res = new StringBuilder();


		  for (int i=0; i<str.length()-word.length()+1; i++){

		    if (str.substring(i,i+word.length()).equals(word)){

		      if (i-1>=0){
		        res.append(str.charAt(i-1));
		      }
		      
		      if (i+word.length()<str.length()){
		        res.append(str.charAt(i+word.length()));
		      }
		      
		      
		      i+=word.length()-1;
		    }

		  }

		  
		  return res.toString();
		  
		}

	
	
	
}
