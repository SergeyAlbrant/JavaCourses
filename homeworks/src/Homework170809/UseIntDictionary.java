package Homework170809;

import Homework170809.Dictionary.Pair;

public class UseIntDictionary {
	
	public static void main(String[] args) {
		
		Dictionary<String, Integer> d = new Dictionary<>();
		
		d.put("Pete", 84532156);
		d.put("John", 84532159);
		d.put("Вася", 84532151);
		d.put("Петя", 84532152);
		d.put("Боря", 84532154);
		d.put("Оля", 843432156);
		d.put("Жанна", 8452354);
		d.put("Маша", 84536545);
		d.put("Вано", 84535456);
		System.out.println(d.getCounter());
		
		System.out.println(d.get("Ann"));
		System.out.println(d.get("John"));
		System.out.println(d.get("Вася"));
		

		
//		for (Pair pair : d) {
//			System.out.println(pair.key + " : " + pair.value);
//		}
//		System.out.println(d.getCounter());
	}

}