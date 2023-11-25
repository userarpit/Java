package threadpkg;

class MyThread extends Thread{    
    public void run(){
        	System.out.println("shut down hook task completed..");	
        }   
}    

public class TestShutdown1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t1);
		//r.halt(0);
		System.out.println("test");
		try { Thread.sleep(100); } catch(Exception e) { e.printStackTrace();}
		//r.removeShutdownHook(t1);
		//System.gc();
		System.out.println(r.availableProcessors());
		System.out.println("before " + r.freeMemory());
		System.out.println(r.totalMemory());
		
		System.gc();
		System.out.println("After " +  r.freeMemory());
		try {
	//		r.exec("sudo shutdown -h now");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}
}