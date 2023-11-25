package threadpkg;

public class Multi extends Thread{

	public void run() {
		System.out.println("run");
		try {
			Thread.sleep(5000);	
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1 = new Multi();
		
		System.out.println(t1.getState());
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getState());
		System.out.println(t1.toString());
		System.out.println("Sub thread priority " + t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.isAlive());
		System.out.println("subthread is daemon - " + t1.isDaemon());
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	//	t1.start();
		try {
			Thread.sleep(2000,5);	
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		
		System.out.println("************  Main Thread data below  **********************");
		
		//t1.stop();
		//System.out.println(t1.getState());
		Thread t = Thread.currentThread();
		System.out.println(t.getState());
		System.out.println(t.toString());
		System.out.println("Main Thread priority " + t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.isAlive());
		System.out.println("subthread status " + t1.isAlive());
		System.out.println("main thread is daemon - " + t.isDaemon());
		System.out.println(t.isInterrupted());
	}
}