package IOPkg;
import java.io.PipedReader;
import java.io.PipedWriter;
public class PipesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			final PipedReader pr = new PipedReader();
			final PipedWriter pw = new PipedWriter();	
			pw.connect(pr);
		
		Thread t1 = new Thread(new Runnable() {
			 public void run() {
				try {
					pw.write("I love my country\n".toCharArray());  
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {  
            public void run() {  
                try {  
                    int data = pr.read();  
                    while (data != -1) {  
                        System.out.print((char) data);  
                        data = pr.read();  
                    }  
                } catch (Exception ex) {  
                }  
            }  
        });  
	
		
		t1.start();
		t2.start();
		Thread.sleep(2000);
		pr.close();pw.close();
	}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}