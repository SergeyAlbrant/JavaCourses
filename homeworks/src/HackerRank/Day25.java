package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Day25 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(T-->0){
            list.add(sc.nextInt());
        }
        sc.close();
        for (Integer num : list) {
        	if (isPrime(num)) System.out.println("Prime");	
        	else System.out.println("Not prime");
		}
	}

	private static boolean isPrime(int num) {
		if (num<2) return false;
		if (num>=4){
			for (int i = 2; i*i <= num; i++) {
				if (num%i == 0) return false;
			}
		}
		return true;
	}
}
