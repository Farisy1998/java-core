package com.executerframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {
		MyCallable[] callables = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable callable : callables) {
			Future<Integer> future = service.submit(callable);
			try {
				System.out.println(future.get()); /// To get the output of each callables
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
