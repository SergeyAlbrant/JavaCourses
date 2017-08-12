package HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day29 {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		 
		int N, K;
		
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
         
        for (int i = 0; i < T; i++) {
        	int max = -1;
        	N = sc.nextInt();
        	K = sc.nextInt();
        	for (int j = 1; j < N; j++) {
				for (int k = j+1; k <= N; k++) {
					int multiply = j&k;
					if (multiply > max && multiply < K ){
						max = multiply;
					}
				}
			}
        	System.out.println(max);
		}
        sc.close();
        
         
        
    }

}
