package threadpkg;

public class Table {

	synchronized static void printTable(int n) {
		for(int i = 1;i<=10;i++) {
			System.out.println(n * i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread1 t1 = new Thread1();
			Thread2 t2 = new Thread2();
			Thread3 t3 = new Thread3();
			t1.start();
			t2.start();
			try {t2.join();} catch(Exception e) { e.printStackTrace();}
			t3.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		Table.printTable(10);
	}
}

class Thread2 extends Thread {
	public void run() {
		Table.printTable(100);
	}
}
class Thread3 extends Thread {
	public void run() {
		Table.printTable(1000);
	}
}