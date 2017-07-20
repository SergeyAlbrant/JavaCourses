package Homework170630;

public class Genome {

	public static void main(String[] args) {
		
		byte[] data = DataGenerator.generate(1000);
		
		for (byte b : data) {
			System.out.print((char)b);
		}
		
		System.out.println("");
		System.out.println(findDuplicats(data, 8));
		
	}

	public static int findDuplicats(byte[] data, int w) {
		
		int counter = 0;
		boolean flag=true;
		
  		for (int i = 0; i < data.length - w; i++) {
			 for (int j = i+1; j < data.length - w + 1; j++) {
				flag=true;
				for (int k = 0; k < w; k++) {
					
					if (data[i+k]!=data[j+k]){
						flag=false;
						break;
					}
					
				}
				if (flag) {
					System.out.println("first substring begins at: "+i+", second substring begins at: "+j);
					counter++;
					
				}
					
			}
		}
		
		
		return counter; 
	}

	
}
