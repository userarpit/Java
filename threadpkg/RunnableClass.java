package threadpkg;

public class RunnableClass implements Runnable{

	public void run() {
		System.out.println("run using runnable");
		try {
			Thread.sleep(5000);	
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("run using runnable after sleep");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableClass rc = new RunnableClass();
		Thread t1 = new Thread(rc);
		t1.start();
		System.out.println("main thread");
	}
}