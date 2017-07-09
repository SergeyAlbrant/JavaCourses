package Homework170704;

public class Array3 {
	
	public static void main(String[] args) {
		
	}
	
	public static int maxSpan(int[] nums) {
		  
		  if (nums.length==0) return 0;
		  
		  int span = 1;
		  
		  for (int i=0; i<nums.length; i++){
		    for (int j=i+1; j<nums.length; j++){
		      if (nums[i]==nums[j] && (j-i+1)>span){
		        span=j-i+1;
		      }
		    }
		  }
		  
		  return span;
		  
		}

	
	public static int[] fix34(int[] nums) {
		  

		  int pos_after3 = 0;
		  
		  Label: for (int i=0; i<nums.length-1; i++){
		    if (nums[i]==3) {
		      pos_after3 = i+1;
		      for (int j=1; j<nums.length; j++){
		        if (nums[j]==4 && nums[j-1]!=3 ){

		          nums[j]=nums[pos_after3];
		          nums[pos_after3]=4;
		          continue Label;
		        
		        }
		    }
		    }
		  }
		  
		  return nums;
		  
		}

	
	public static int[] fix45(int[] nums) {
		  
		  int pos_after4 = 0;
		  
		  Label: for (int i=0; i<nums.length-1; i++){
		    if (nums[i]==4) {
		      pos_after4 = i+1;
		      
		      if (nums[0]==5){

		          nums[0]=nums[pos_after4];
		          nums[pos_after4]=5;
		          continue Label;
		        
		        }
		      
		      for (int j=1; j<nums.length; j++){
		        if (nums[j]==5 && nums[j-1]!=4){

		          nums[j]=nums[pos_after4];
		          nums[pos_after4]=5;
		          continue Label;
		        
		        }
		      }
		    }
		  }
		  
		  return nums;
		  
		}

	
	public static boolean canBalance(int[] nums) {
		  
		  
		  
		  for (int i=1; i<nums.length; i++){
		    int sum1 = 0, sum2 = 0;
		    for (int j=0; j<i; j++){
		      sum1+=nums[j];
		    }

		    for (int j=i; j<nums.length; j++){
		      sum2+=nums[j];
		    }
		    
		    if (sum1==sum2) return true;
		    
		  }
		  
		  return false;
		  
		}

	
	public static boolean linearIn(int[] outer, int[] inner) {
		  
		 int count = 0;
		  for (int i = 0; i < inner.length; i++) {
		    for (int j = 0; j < outer.length; j++) {
		      if (inner[i] == outer[j]) {
		      count++;
		      break;
		      }
		    }
		  }
		  
		  if (count == inner.length) return true;

		  return false;
		  
		}

	
	public static int[] squareUp(int n) {
		  
		  int[] r = new int[n*n];
				
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i + j < n - 1) {
						} else {
							r[i*n +j] = n - j;
						}
					}
				}
				
				return r;
		  
		}

	
	public static int[] seriesUp(int n) {
		  
		  int[] arr = new int[n*(n+1)/2];
		  int count = 0;
		  
		  for (int i = 0; i < n; i++) {
		    for (int j = 0; j <= i; j++) {
		      
		      arr[count]=j+1;
		      count++;
		      
		    }
		  }
		  
		  return arr;
		  
		}

	
	public static int maxMirror(int[] nums) {
	    
	    int max = 0;
	    
	    for(int i = 0; i < nums.length; i++) {
	        int count = 0;
	        for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
	            if (nums[i + count] == nums[j]) {
	                count++;
	            } else {
	                max = Math.max(max, count);
	                count = 0;
	            }
	        }
	                                                                
	        max = Math.max(max, count);
	    }

	    return max;
	}
	
	public static int countClumps(int[] nums) {
		  
		  int counter = 0;

		  if (nums.length<1) return 0;
		    
		  for (int i = 1; i < nums.length-1; i++) {
		        
		        if (nums[i]==nums[i-1] && nums[i]!=nums[i+1]){
		            counter++;
		        }
		  }
		  
		  if (nums[nums.length-1]==nums[nums.length-2] ){
		            counter++;
		          }
		  
		  return counter;
		    
		  
		}

	
	

}
