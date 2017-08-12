package HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		List<String> list = new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
        	list.add(sc.nextLine());
		}
        sc.close();
        
        Collections.sort(list);
        
        for (int i = 0; i < num; i++) {
        	if (list.get(i).endsWith("@gmail.com")){
        		System.out.println(list.get(i).split(" ")[0]);
        	}
		}
        
    }

}
