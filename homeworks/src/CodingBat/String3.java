package CodingBat;

public class String3 {
	
	public static void main(String[] args) {
		
		System.out.println(notReplace("This is isabell"));
	}

	public static int countYZ(String str) {
		  
		  int counter = 0;


		  for (int i=0; i<str.length(); i++){

		    if ((str.length()-1==i || !Character.isLetter(str.charAt(i+1))) 
		    && (Character.toLowerCase(str.charAt(i))=='z' || 
		    Character.toLowerCase(str.charAt(i))=='y')){
		      counter++;
		    }
		  }


		  
		  return counter;
		  
		}

	
	public static String withoutString(String base, String remove) {
	    
	    StringBuilder res = new StringBuilder();
	    
	    int index = base.toLowerCase().indexOf(remove.toLowerCase());
	    
	    while (index >= 0) {
	        res.append(base.substring(0, index));
	        base = base.substring(index + remove.length());
	        index = base.toLowerCase().indexOf(remove.toLowerCase());
	    }
	    res.append(base);
	    return res.toString();
	}
	
	
	public static boolean equalIsNot(String str) {
		  
		  int is_counter=0;
		  int not_counter=0;
		  
		  for (int i=0; i<str.length()-1; i++){
		    if (i!=str.length()-2 && str.substring(i,i+3).equals("not")){
		      not_counter++;
		    }
		    if (str.substring(i,i+2).equals("is")){
		      is_counter++;
		    }
		    
		  }
		    
		  return (is_counter==not_counter);
		  
		}

	
	public static boolean gHappy(String str) {
 
		  for (int i=0; i<str.length(); i++){
		    if (str.charAt(i)=='g'){
		      if (str.length()==1) return false;
		      if (str.length()-1==i){
		        return str.charAt(i-1)=='g'? true : false;
		      }
		      if (0==i && str.charAt(i+1)=='g') continue;
		    
		      if (str.charAt(i-1)=='g' || str.charAt(i+1)=='g'){
		         i++;
		      }
		      else return false;
		    }
		  }
		    
		  return true;
		  
		}
	
	public static int countTriple(String str) {
		  
		  int counter=0;
		  
		  for (int i=0; i<str.length()-2; i++){

		    if (str.charAt(i)==str.charAt(i+1) && str.charAt(i+2)==str.charAt(i+1)){
		      counter++;
		    }
		    
		  }
		    
		  return counter;
		  
		}

	
	public static int sumDigits(String str) {
		  
		  int sum=0;
		  
		  for (int i=0; i<str.length(); i++){

		    if (Character.isDigit(str.charAt(i))){
		      sum+=Integer.parseInt(str.substring(i,i+1));
		    }
		    
		  }
		    
		  return sum;
		  
		}

	
	public static String sameEnds(String string) {
		  
		  String sub = "";
		  
		  for (int i=0; i<string.length()/2; i++){
		    
		    if (string.substring(0,i+1).equals(string.substring(string.length()-i-1))){
		      sub=string.substring(0,i+1);
		    }
		  }
		  
		  return sub;
		}


	
	public static String mirrorEnds(String string) {
		  
		  String sub = "";
		  
		  for (int i=0; i<string.length(); i++){
		    
		    if (string.charAt(i)==string.charAt(string.length()-i-1)){
		      sub=string.substring(0,i+1);
		    }
		    else return sub;
		  }
		  
		  return sub;
		  
		}

	
	public static int maxBlock(String str) {
		  
		  int counter=1;
		  int max_counter=0;
		  
		  for (int i=0; i<str.length()-1; i++){

		    if (str.charAt(i)==str.charAt(i+1)){
		      counter++;
		    }
		    else {
		      counter=1;
		    }
		    if (counter>max_counter){
		        max_counter=counter;
		      }
		    
		  }
		    
		  return max_counter;
		  
		}

	
	public static int sumNumbers(String str) {
		  
		  int sum=0;
		  String number = "";
		  
		  for (int i=0; i<str.length()-1; i++){

		    if (Character.isDigit(str.charAt(i))){
		      number+=str.charAt(i);
		      if (!Character.isDigit(str.charAt(i+1))){
		        sum+=Integer.parseInt(number);
		        number="";
		      }
		      else if (i==str.length()-2){
		        number+=str.charAt(i);
		        sum+=Integer.parseInt(number);
		        
		      }
		      
		    }
		    else if (i==str.length()-2 && Character.isDigit(str.charAt(i+1))){
		      sum+=Integer.parseInt(str.substring(i+1,i+2));
		    }
		    
		  }
		    
		  return sum;
		  
		}

	
	public static String notReplace(String str) {
		  
		  StringBuilder res = new StringBuilder();
		  
		  for (int i=0; i<str.length()-1; i++){
		    
		    if (i==0){
		      if (str.substring(i,i+2).equals("is") && (str.length()==2 || !Character.isLetter(str.charAt(i+2)))){
		        res.append("is not");
		        i+=1;
		      }
		      else {
		        res.append(str.substring(i,i+1));
		      }
		      continue;
		    }
		    
		    if (i==str.length()-2){
		      if (str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))){
		        res.append("is not");
		        i+=1;
		      }
		      else {
		        res.append(str.substring(i));
		      }
		      break;
		    }

		    if (str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))&& !Character.isLetter(str.charAt(i+2))){
		      res.append("is not");
		      i+=1;
		    }
		    else {
		      res.append(str.substring(i,i+1));
		    }
		  }
		    
		  return res.toString();
		  
		}
	
}
