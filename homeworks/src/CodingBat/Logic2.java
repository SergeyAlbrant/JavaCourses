package CodingBat;

public class Logic2 {

	public static boolean makeBricks(int small, int big, int goal) {
		  if(goal> big*5+small) return false;
		  if(goal%5> small) return false;
		  return true;
		}

	
	public static int loneSum(int a, int b, int c) {
		  
		  if (a==b && b==c) return 0;
		  if (a==b) return c;
		  if (c==b) return a;
		  if (a==c) return b;
		  return a+b+c;
		}

	
	public static int luckySum(int a, int b, int c) {
		  if (a==13) return 0;
		  if (b==13) return a;
		  if (c==13) return a+b;
		  return a+b+c;
		}

	
	public static int noTeenSum(int a, int b, int c) {
		  
		  return fixTeen(a)+fixTeen(b)+fixTeen(c);
		}

	
	public static int fixTeen(int n){
		  
		  if (n>=13 && n<=19 && n!=15 && n!=16){
		    return 0;
		  }
		  return n;
		  
		}
	
	public static int roundSum(int a, int b, int c) {
		  return round10(a)+round10(b)+round10(c);
		}

	public static int round10(int num) {
		  
		  if (num % 10 >= 5) {
		    return (num+(10 - num % 10));
		  }
		  else{
		    return (num - num % 10);
		  }
		  
		}
	
	public static boolean closeFar(int a, int b, int c) {
		  if ((Math.abs(a-b)<=1 && Math.abs(c-b)>=2 && Math.abs(c-a)>=2) || (Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(c-b)>=2)){
		    return true;
		    }
		  return false;
		}

	
	public static int blackjack(int a, int b) {
		  if (a>21 && b>21){
		    return 0;
		  }
		  if (a>21 || b>21) return a<b ? a : b;
		  
		  return a>b ? a : b;
		}

	
	public static boolean evenlySpaced(int a, int b, int c) {
		  
		  if(a==b && b==c) return true;
		  if(a==b || a==c || b==c) return false;
		  return (Math.abs(a-b)==Math.abs(c-b) || Math.abs(a-b)==Math.abs(c-a) || Math.abs(b-c)==Math.abs(c-a));
		  
		}

	
	public static int makeChocolate(int small, int big, int goal) {
		  
		  int res=0;
		  int i=0;
		  if(goal>big*5+small) return -1;
		  while(res<=goal && i<big) {
		  res=res+5; i++;
		  }
		  if(res==goal) return 0;

		  if(res>goal) res=res-5;
		  if(goal-res>small) return -1;
		  return (goal-res);

		  
		}

	
	
		
	
	
}
