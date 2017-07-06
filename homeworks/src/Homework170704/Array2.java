package Homework170704;

import java.util.Arrays;

public class Array2 {
	
	public static void main(String[] args) {
		
		System.out.println(countEvens(new int[] { 2, 12, 7, 4 }));
		
	}
	

	public static int countEvens(int[] nums) {
		  
		  int counter=0;
		  
		  for (int i=0; i<nums.length; i++){
		    
		    if (nums[i]%2==0) counter++;
		    
		  }
		  
		  return counter;
		  
		}

	
	public static int bigDiff(int[] nums) {
		  int max=0;
		  int min=100000;
		  
		  for (int i=0; i<nums.length; i++){
		    max = Math.max(nums[i], max);
		    min = Math.min(nums[i], min);
		  }
		  
		  return Math.abs(max - min);
		  
		}

	
	public static int centeredAverage(int[] nums) {
		  int sum=0;
		  
		  Arrays.sort(nums);
		  
		  for (int i=1; i<nums.length-1; i++){
		    sum+=nums[i];
		  }
		  
		  
		  return sum/(nums.length-2);
		  
		}

	
	public static int sum13(int[] nums) {
		  
		  
		  int sum=0;

		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==13) {
		      i+=1;
		      continue;
		    }
		    sum+=nums[i];
		  }
		  
		  return sum;
		  
		}

	
	public static int sum67(int[] nums) {
		  
		  int sum=0;
		  boolean flag = false;

		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==6) {
		      flag=true;
		      continue;
		    }
		    if (nums[i]==7 && flag) {
		      flag=false;
		      continue;
		    }

		    if (!flag) sum+=nums[i];
		  }
		  
		  return sum;
		  
		}

	public static boolean has22(int[] nums) {
		  
		  for (int i=0; i<nums.length-1; i++){
		    if (nums[i]==2 && nums[i+1]==2) {
		      return true;
		    }
		  }
		  
		  return false;
		  
		}

	
	public static boolean lucky13(int[] nums) {
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==1 || nums[i]==3) {
		      return false;
		    }
		  }
		  
		  return true;
		  
		}

	
	public static boolean sum28(int[] nums) {
		  
		  int sum=0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==2) {
		      sum+=2;
		    }
		  }
		  
		  return sum==8 ? true : false;
		  
		}

	
	public static boolean more14(int[] nums) {
		  
		  int ones=0, fours =0;
		  
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==1) {
		      ones++;
		    }
		    
		    if (nums[i]==4) {
		      fours++;
		    }
		    
		    
		  }
		  
		  return ones>fours ? true : false;
		  
		}

	
	public static int[] fizzArray(int n) {
		  int[] arr = new int[n];
		  
		  for (int i=0; i<arr.length; i++){
		    arr[i]=i;
		  }
		  
		  return arr;
		}

	
	public static boolean only14(int[] nums) {

		  for (int num : nums){
		    if (num != 1 && num!=4) return false;
		  }
		  return true;
		}

	
	public static String[] fizzArray2(int n) {
		  
		  String[] arr = new String[n];
		  
		  for (int i=0; i<arr.length; i++){
		    arr[i]=String.valueOf(i);
		  }
		  
		  return arr;
		}

	
	public static boolean no14(int[] nums) {
		  boolean ones = false;
		  boolean fours = false;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==1) {
		      ones=true;
		    }
		    
		    if (nums[i]==4) {
		      fours=true;
		    }
		  }
		  
		  return !ones||!fours;
		  
		}

	
	public static boolean isEverywhere(int[] nums, int val) {
		  

		  
		  for (int i=0; i<nums.length-1; i++){
		    if (!(nums[i]==val || nums[i+1]==val)) {
		      return false;
		    }
		  }
		  
		  return true;
		    
		}

	
	public static boolean either24(int[] nums) {
		  
		  boolean two_pair = false;
		  boolean four_pair = false;
		  
		  for (int i=0; i<nums.length-1; i++){
		    if (nums[i]==2  && nums[i+1]==2) {
		      two_pair=true;
		    }
		    
		    if (nums[i]==4 && nums[i+1]==4) {
		      four_pair=true;
		    }
		  }
		  
		  return (two_pair || four_pair) &&  !(two_pair && four_pair);
		  
		}

	
	public static int matchUp(int[] nums1, int[] nums2) {
		  
		  int count=0;
		  
		  for (int i=0; i<nums1.length; i++){
		    if (nums1[i]!=nums2[i] && Math.abs(nums1[i]-nums2[i])<3) {
		      count++;
		    }
		  }
		  
		  return count;
		  
		}

	
	public static boolean has77(int[] nums) {
		  
		  for (int i=1; i<nums.length-1; i++){
		    if ((nums[i+1]==7&& (nums[i]==7 || nums[i-1]==7 )) || (nums[i]==7 && nums[i-1]==7 )) {
		      return true;
		    }
		  }
		  
		 
		  
		  return false;
		  
		}

	
	public static boolean has12(int[] nums) {
		  
		  boolean isOne = false;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==1) {
		      isOne=true;
		    }
		    if (isOne && nums[i]==2){
		      return true;
		    }
		  }
		  
		 
		  
		  return false;
		  
		}

	
	public static boolean modThree(int[] nums) {
		  
		  for (int i=1; i<nums.length-1; i++){
		    if ((nums[i-1]%2==1 && nums[i]%2==1 && nums[i+1]%2==1) || (nums[i-1]%2==0 && nums[i]%2==0 && nums[i+1]%2==0)){
		      return true;
		    }
		  }
		  return false;
		  
		}

	
	public static boolean haveThree(int[] nums) {
		  
		  boolean next = false;
		  int counter = 0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]==3){
		      if (next) return false;
		      next=true;
		      counter++;
		    }
		    else next=false;
		    
		  }

		  
		  return counter==3;
		  
		}

	
	public static boolean twoTwo(int[] nums) {
		  

		  if (nums.length==1 && nums[0]==2) return false;
		  if (nums.length<2) return true;
		  
		  for (int i=0; i<nums.length-1; i++){
		    if (nums[i]==2) {
		      if (nums[i+1]!=2){
		        return false;
		      }
		      i++;
		    }
		  }
		  
		  if (nums[nums.length-1]==2 && nums[nums.length-2]!=2) return false;
		  
		  return true;
		  
		}

	
	public static boolean sameEnds(int[] nums, int len) {
		  
		  for (int i=0; i<len; i++){
		    if (nums[i]!=nums[nums.length-len+i]) {
		        return false;
		    }
		  }
		  return true;
		  
		}

	
	public static boolean tripleUp(int[] nums) {
		  
		  for (int i=1; i<nums.length-1; i++){
		    if (nums[i]==nums[i-1]+1 && nums[i]==nums[i+1]-1) {
		      return true;
		    }
		  }
		  return false;
		}

	
	
	public static int[] fizzArray3(int start, int end) {
		  
		  int[] res = new int[end-start];
		  
		  for (int i=0; i<res.length; i++){
		    res[i]=i+start;
		  }
		  
		  return res;
		  
		}

	
	public static int[] shiftLeft(int[] nums) {
		  
		  if (nums.length<2) return nums;
		  
		  int[] res = new int[nums.length];
		  
		  res[res.length-1]=nums[0];
		  for (int i=0; i<res.length-1; i++){
		    res[i]=nums[i+1];
		  }
		  
		  return res;
		  
		}

	
	public static int[] tenRun(int[] nums) {
		  
		  boolean mult10 = false;
		  int value = 0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i] % 10 == 0) {
		      mult10 = true;
		      value = nums[i];
		    }
		    else if (mult10) {
		      nums[i]=value;
		    }
		  }
		  
		  return nums;
		  
		  
		}

	
	public static int[] pre4(int[] nums) {
		  
		  int counter=0;
		  for (int i=0; i<nums.length; i++){
		    if (nums[i] == 4) {
		      break;
		    }
		    counter++;
		  }
		  
		  int[] arr= new int[counter];
		  
		  for (int i=0; i<counter; i++){
		    arr[i]=nums[i];
		  }
		  
		  return arr;
		}

	
	public static int[] post4(int[] nums) {
		  
		  int pos=0;
		  for (int i=0; i<nums.length; i++){
		    if (nums[i] == 4) {
		      pos=i;
		    }
		  }
		  
		  int length = nums.length-(pos+1);
		  int[] arr= new int[length];
		  
		  for (int i=0; i<length; i++){
		    arr[i]=nums[i+pos+1];
		  }
		  
		  return arr;
		  
		}

	
	public static int[] notAlone(int[] nums, int val) {
		  
		 
		  for (int i=1; i<nums.length-1; i++){
		    if (nums[i] == val && nums[i-1] != val && nums[i+1] != val) {
		      nums[i]=Math.max(nums[i-1], nums[i+1]);
		    }
		  }
		  
		  return nums;
		  
		  
		}

	
	public static int[] zeroFront(int[] nums) {

		  
		  int counter = 0, temp=0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i] == 0) {
		      temp=nums[counter];
		      nums[counter]=0;
		      nums[i]=temp;
		      counter++;
		    }
		  }
		  
		  
		  
		  return nums;
		  
		}

	
	public static int[] withoutTen(int[] nums) {
		  
		  int counter = 0, temp = 0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i] == 10) {

		      nums[i] = 0;
		      
		    }
		    else {
		      temp=nums[counter];
		      nums[counter]=nums[i];
		      nums[i]=temp;
		      counter++;
		      
		    }
		  }
		  
		  
		  
		  return nums;
		  
		}

	
	public static int[] zeroMax(int[] nums) {
		  
		  int max_odd = 0;

		  for (int i=nums.length-1; i>=0; i--){
		    if (nums[i]%2==1 && nums[i]>max_odd) {
		      max_odd=nums[i];
		    }
		    if (nums[i] == 0) {

		      nums[i] = max_odd;
		      
		    }
		  }

		  
		  return nums;
		  
		}

	
	public static int[] evenOdd(int[] nums) {
		  
		  int counter = 0, temp = 0;
		  
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]%2 == 0) {

		      temp=nums[counter];
		      nums[counter]=nums[i];
		      nums[i]=temp;
		      counter++;
		      
		    }
		  }
		  
		  
		  
		  return nums;
		  
		}

	
	public static String[] fizzBuzz(int start, int end) {
		  
		  
		  String[] fb = new String[end-start];
		  
		  for (int i=0; i<fb.length; i++){
		    int pos=start+i;
		    fb[i]="";
		    if (pos%3 == 0) {
		      fb[i]+="Fizz";
		    }
		    if (pos%5 == 0) {
		      fb[i]+="Buzz";
		    }
		    if (fb[i].equals("")){
		      fb[i]=String.valueOf(start+i);
		    }
		      
		      
		  }
		  
		  return fb;
		  
		}

	
	
	
}
