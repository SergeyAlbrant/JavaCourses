package CodingBat;

public class Recursion2 {
	
	public static boolean groupSum(int start, int[] nums, int target) {
		  
		  if (nums.length<=start) {
		    return (target ==0);
		  }
		  
		  if (groupSum(start+1, nums, target-nums[start]) || 
		  groupSum(start+1, nums, target)) return true;
		  else return false;
		}

	
	public static boolean groupSum6(int start, int[] nums, int target) {
		  if (nums.length<=start) {
		    return (target ==0);
		  }
		  
		  if (nums[start]==6) {
		    if (groupSum6(start+1, nums, target-nums[start])) return true;
		  }
		  else if (groupSum6(start+1, nums, target-nums[start]))  return true;
		  
		  else if (groupSum6(start+1, nums, target)) return true;

		  return false;
		}

	
	public static boolean groupNoAdj(int start, int[] nums, int target) {
		  if (nums.length<=start) {
		    return (target ==0);
		  }
		  
		  if (groupNoAdj(start+2, nums, target-nums[start]))  return true;
		  
		  if (groupNoAdj(start+1, nums, target)) return true;

		  return false;
		}
	
	public static boolean groupSum5(int start, int[] nums, int target) {
		  
		  if (nums.length <= start) return (target == 0);
		  
		  if (groupSum5(start+1, nums, target-nums[start]) && check1(start, nums)) return true;
		  if (nums[start] % 5 != 0 && groupSum5(start+1, nums, target)) return true;
		  else return false;
		}

	private static boolean check1(int start, int[] nums) {
		  if (start == 0) return true;
		  if (start > 0 && nums[start-1] % 5 == 0 && nums[start] == 1)
		    return false;
		  else
		    return true;
		}
	
	public static boolean groupSumClump(int start, int[] nums, int target) {
		  
		  if (nums.length <= start) return (target == 0);
		  
		  int i=1;
		  int end=start;
		  while (nums.length-1 > end && nums[end]==nums[end+1]) {
		    i++;
		    end++;
		  }
		  
		  
		  if (groupSumClump(start+i, nums, target-nums[start]*i))  return true;
		  
		  if (groupSumClump(start+i, nums, target)) return true;
		  
		  else return false;
		  
		}

	
	public static boolean splitArray(int[] nums) {
		  int index = 0;
		  int sum1 = 0;
		  int sum2 = 0;
		  return helper1(nums, index, sum1, sum2);
		}

		private static boolean helper1 ( int[] nums, int index, int sum1, int sum2 ) {
		  if ( index >= nums.length ) {
		    return sum1 == sum2;
		  }

		  int value = nums[index];

		  return (helper1(nums, index + 1, sum1 + value, sum2) || 
		    helper1(nums, index + 1, sum1, sum2 + value));
		}
		
		
		
		
	public static boolean splitOdd10(int[] nums) {
			 int index = 0;
			 int sum1 = 0;
			 int sum2 = 0;
			 return helper2(nums, index, sum1, sum2);
		}

		private static boolean helper2 (int[] nums, int index, int sum1, int sum2 ) {
			  if (index >= nums.length) {
			    return (sum1%10 == 0 && sum2%2 == 1) || (sum1%2 == 1 && sum2%10 == 0);
			  }

			  int value = nums[index];

			  return (helper2(nums, index + 1, sum1 + value, sum2) || 
			  helper2(nums, index + 1, sum1, sum2 + value));
			}

	

		public static boolean split53(int[] nums) {
			  int index = 0;
			  int sum1 = 0;
			  int sum2 = 0;
			  return helper3(nums, index, sum1, sum2);
			}

			private static boolean helper3 (int[] nums, int index, int sum1, int sum2 ) {
			  if (index >= nums.length) {
			    return sum1 == sum2;
			  }

			  int value = nums[index];
			  if (value%5==0) return helper3(nums, index + 1, sum1 + value, sum2);
			  else if (value%3==0) return helper3(nums, index + 1, sum1, sum2 + value);
			  else return (helper3(nums, index + 1, sum1 + value, sum2) || 
			  helper3(nums, index + 1, sum1, sum2 + value));
			}

}
