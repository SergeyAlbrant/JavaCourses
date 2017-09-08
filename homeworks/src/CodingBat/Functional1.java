package CodingBat;

import java.util.List;

public class Functional1 {

	public static List<Integer> doubling(List<Integer> nums) {
		  
		  nums.replaceAll(n->2*n);
		  return nums;
		  
		}

	public static List<Integer> square(List<Integer> nums) {
		  nums.replaceAll(n->n*n);
		  return nums;
		}

	
	public static List<String> addStar(List<String> strings) {
		  strings.replaceAll(s->s+="*");
		  return strings;
		}

	
	public static List<String> copies3(List<String> strings) {
		  strings.replaceAll(s->s+=s+s);
		  return strings;
		}

	
	public static List<String> moreY(List<String> strings) {
		  strings.replaceAll(s -> "y"+s+"y");
		  return strings;
		}

	
	public static List<Integer> math1(List<Integer> nums) {
		  nums.replaceAll(n->(n+1)*10);
		  return nums;
		}

	
	public static List<Integer> rightDigit(List<Integer> nums) {
		  nums.replaceAll(n->n%10);
		  return nums;
		}

	
	public static List<String> lower(List<String> strings) {
		  strings.replaceAll(String::toLowerCase);
		  return strings;
		}

	
	public static List<String> noX(List<String> strings) {
		  strings.replaceAll(s->s.replace("x",""));
		  return strings;
		}

	
	
	
}
