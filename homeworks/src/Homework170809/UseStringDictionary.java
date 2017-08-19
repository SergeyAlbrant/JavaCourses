package Homework170809;

import Homework170809.Dictionary.Pair;

public class UseStringDictionary {
	
	public static void main(String[] args) {
		
		Dictionary<String, String> d = new Dictionary<>();
		
		d.put("Pete", "New York");
		d.put("John", "Boston");
		d.put("����", "������");
		d.put("����", "������");
		d.put("����", "������");
		d.put("���", "������");
		d.put("�����", "������");
		d.put("����", "������");
		d.put("����", "������");
		
		System.out.println(d.get("Ann"));
		System.out.println(d.get("John"));
		System.out.println(d.get("����"));
		
		d.put("����", "���������");
		System.out.println(d.get("����"));
		
		for (Pair pair : d) {
			System.out.println(pair.key + " : " + pair.value);
		}
		
	}

}