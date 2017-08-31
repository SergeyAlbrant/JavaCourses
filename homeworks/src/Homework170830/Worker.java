package Homework170830;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;;

public class Worker implements Executor {
	
	static final Runnable POISON_PILL = () -> {};
	static private boolean stop = false;
	static private volatile boolean stopNow = false;
	
	BlockingQueue<Runnable> tasks = new BlockingQueue<>();
	
	public Worker() {
		new Thread(this::processTasks).start();
	}

	@Override
	public void execute(Runnable command) {
		if (!stop && !stopNow ){
			tasks.put(command);
		}
		else {
			throw new RejectedExecutionException("Worker has been shut down!");
		}
	}
	
	private void processTasks() {
		while (!stopNow) {
			Runnable task = tasks.take();
			if (task == POISON_PILL) {
				return;
			}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
		
	}
	
	public void shutdown() {
		tasks.put(POISON_PILL);
		stop=true;
	}
	
	public List<Runnable>  shutdownNow() {
		stopNow=true;
		tasks.items.remove(POISON_PILL);
		return (List<Runnable>)tasks.items;
	}
	
}