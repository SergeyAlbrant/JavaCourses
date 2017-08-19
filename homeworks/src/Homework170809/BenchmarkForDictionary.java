package Homework170809;

public class BenchmarkForDictionary {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			test(1_000*((int)Math.pow(10, i)));
		}
	}

	private static void test(int n) {
		Dictionary<String, String> d1 = new Dictionary<>();

        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            d1.put("key " + i, "value " + i);
        }
        long stop = System.nanoTime();
        System.out.println("Put "+ n+ " elements in: " + (stop - start)+ " nanoseconds");
        
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            d1.get("key " + i);
        }
        stop = System.nanoTime();
        System.out.println("Got "+ n + " elements in: " + (stop - start)+ " nanoseconds");
		
	}

}
