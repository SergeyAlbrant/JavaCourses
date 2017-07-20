package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

	public static void main(String []argh){
        Map myMap = new HashMap<String, String>(); 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (myMap.containsKey(s)){
                System.out.println(s+"="+myMap.get(s));
            }
            else System.out.println("Not found");// Write code here
        }
        in.close();
    }
	
}
