package threadpkg;

public class ThreadGroupDemo extends Thread{

	public ThreadGroupDemo(ThreadGroup tg1, String string) {
		// TODO Auto-generated constructor stub
		super(tg1,string);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg1 = new ThreadGroup("Parent");
	//	ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroupDemo t1 = new ThreadGroupDemo(tg1,"one");
		ThreadGroupDemo t2 = new ThreadGroupDemo(tg1,"two");
		ThreadGroupDemo t3 = new ThreadGroupDemo(tg1,"three");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		tg1.list();
		/*try {
			t1.join();
			t2.join();
			t3.join();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		System.out.println(tg1.activeCount());
		System.out.println(tg1.getParent().getName());
		t1 = null;
		//tg1.interrupt();
		System.gc();
	}
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}

}
