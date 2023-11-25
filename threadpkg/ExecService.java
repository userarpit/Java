package threadpkg;

import java.util.concurrent.*;

public class ExecService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		for(int i =0;i<5;i++ ) {
			es.execute(new A());
		}
		es.shutdown();
		//es.execute(new A());
	}	
}

class A implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread from pool running");
	}
}
