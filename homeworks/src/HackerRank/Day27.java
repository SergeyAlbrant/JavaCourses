package HackerRank;

import java.util.Random;

public class Day27 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int T=5;
		int N, K, a;
		Random random = new Random();
		System.out.println(T);
		
		for (int i=0;i<T;i++){
			 N = random.nextInt(199)+1;
	         K = random.nextInt(N-1)+1;
	         
	         System.out.println(N + " " + K);
	            System.out.print(0 + " ");
	            for (int j=1;j<N;j++){
	                a = random.nextInt(2000)-1000;
	                System.out.print(a + " ");
	            }
	         System.out.println();
        }
		
	}
}
