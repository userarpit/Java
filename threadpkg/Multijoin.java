package threadpkg;

public class Multijoin implements Runnable {
	   public synchronized void run() {
	      System.out.println(Thread.currentThread().getName() + " is starting");
	      for(int i=0; i < 5; i++) {
	         try {
	            Thread.sleep(1000);
	            System.out.println(Thread.currentThread().getName()  + " " + i + " is running");
	         } catch(InterruptedException ie) {
	            ie.printStackTrace();
	         }
	      }
	      System.out.println(Thread.currentThread().getName() + " is finished");
	   }
	   public static void main(String[] args) {
	      Multijoin test = new Multijoin();
	      Thread t1 = new Thread(test);
	      Thread t2 = new Thread(test);
	      t1.start();
	      t2.start();
	   }
	}