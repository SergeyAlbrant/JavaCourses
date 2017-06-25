package Homework170624;

import java.util.ArrayList;

public class MathUtils {
	
	
	static ArrayList<Integer> primes = make_primes(100);
	static ArrayList<Integer> fibon = make_fibon();
	
	
	private static ArrayList<Integer> make_fibon() {
		ArrayList<Integer> fibon = new ArrayList<Integer>();
		fibon.add(0);
		fibon.add(1);
		for (int i = 1; i < 20; i++){
			fibon.add(fibon.get(i)+fibon.get(i-1));
		}
		return fibon;
		
	}

	private static ArrayList<Integer> make_primes(int a) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int i, num;
	    for (i = 1; i < a; i++)
	    {
	        num = 0;
	        for (int j = 1; j <= i; j++)
	        {
	            if (i % j == 0)
	                num++;
	        }
	        if (num <= 2)
	            primes.add(i);
	    }
	    return primes;
	}

	public static int sign(int a) {
		if (a>0) return 1;
		if (a==0) return 0;
		return -1;
	}

	public static int mod(int a, int b) {
		//if (b==0) ?
		return a-(a/b)*b;
	}

	public static boolean isPrime(int a) {
		for (int i = 0; i < primes.size(); i++) {
			if (primes.get(i)==a) return true;
		}
		return false;
	}

	public static boolean isFibonacci(int a) {
		for (int i = 0; i < fibon.size(); i++) {
			if (fibon.get(i)==a) return true;
		}
		return false;
	}
	
	

}
