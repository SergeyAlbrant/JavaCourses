package HackerRank;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = "";
        while (n>0){
        	res = n%2 + res;
        	n/=2;
        }
        System.out.println(res);
        int num = 1, cur = 1;
        for (int i = 1; i < res.length(); i++) {
			if (res.charAt(i)==res.charAt(i-1)){
				cur++;
			}
			else cur=1;
			
			if (cur>num) num=cur;
		}
        
        System.out.println(num);
        //101
       
	}
}
