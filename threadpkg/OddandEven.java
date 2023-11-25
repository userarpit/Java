package threadpkg;

public class OddandEven {
	int i=1;
	short number = 20;
	void displayEven() {
		synchronized(this) {
			while (i<number) {
				if(i % 2 == 1) {
					try {wait();} catch(Exception e) {e.printStackTrace();}
				}
				System.out.println("Thread t1 " + i);
				i+=1;
				notify();
			}
		}
	}
	
	void displayOdd() {
		synchronized(this) {
			while (i<number) {
				if(i % 2 == 0) {
					try {wait();} catch(Exception e) {e.printStackTrace();}
				}
				System.out.println("Thread t2 " + i);
				i+=1;
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddandEven oe = new OddandEven();
		Runnable r1 = new Runnable() {
			public void run() {
				oe.displayEven();
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				oe.displayOdd();
			}
		};	
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
