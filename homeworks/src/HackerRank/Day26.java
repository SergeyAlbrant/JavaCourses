package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Day26 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);

		int fine = 0;
		
		int actualDay = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
     
        sc.close();
        
        if (actualYear > expectedYear) fine = 10_000;
        else if (actualYear == expectedYear) {
        	if (actualMonth > expectedMonth) {
        		fine = 500 * (actualMonth - expectedMonth);
        	}
        	else if (actualMonth == expectedMonth) {
        		if (actualDay> expectedDay) {
        			fine = 15 * (actualDay - expectedDay);
        		}
        	}
        		
        }
        
        System.out.println(fine);
        
	}
}
