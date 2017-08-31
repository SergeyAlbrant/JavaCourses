package Homework170830;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseWorker {
	
	public static void main(String[] args) {
		
		//ExecutorService worker = Executors.newSingleThreadExecutor();
		
		
		Worker worker = new Worker();
		
		worker.execute(() -> {
			System.out.print("hello, ");
		});

		worker.execute(() -> {
			System.out.println("world!");			
		});
		
		

		worker.shutdown();

		System.out.println(worker.shutdownNow());
		
//		worker.execute(() -> {
//			System.out.println("!!!!");
//		});
	}

}