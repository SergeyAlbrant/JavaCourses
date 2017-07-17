package HackerRank;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        
        in.nextLine();
        
        for (int i = 0; i < n; i++) {
        	arr[i]=	in.nextLine();
		}
        in.close();
       
        
        for (int i = 0; i < n; i++) {
        	char[] val = arr[i].toCharArray();
        	StringBuilder s1 = new StringBuilder();
        	StringBuilder s2 = new StringBuilder();

        	for (int j = 0; j < val.length; j++) {
            	if (j%2 == 0) {
            		s1.append(val[j]);
            	}
            	else s2.append(val[j]);
    		}
        	System.out.println(s1 + " "+ s2);
		}
 
	}
}
