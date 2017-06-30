package Homework170630;

import java.util.Random;

public class DataGenerator {
	
	static final byte[] alphabet = {'A','C','G','T'};
	
	public static byte[] generate(int size) {
		byte[] data = new byte[size];
		
		Random random = new Random();
		
		for (int i = 0; i < data.length; i++) {
			
			data[i]=alphabet[random.nextInt(alphabet.length)];
			
		}
		
		return data;
	}

	
	
}
