package IOPkg;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeChannel {
	public static void main(String[] args) {
		
		Pipe pipe = null;
		try {
			pipe = Pipe.open();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		final Pipe.SinkChannel psic = pipe.sink();
		final Pipe.SourceChannel psoc = pipe.source();	
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ByteBuffer bb = ByteBuffer.allocate(16);
				bb.clear();
				String name = "Arpit Khandelwal";
				bb.put(name.getBytes());
				bb.flip();
				while(bb.hasRemaining()) {
					try {
						psic.write(bb);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ByteBuffer bbr = ByteBuffer.allocate(16);
				try {
					int bytesread = psoc.read(bbr);
					bbr.flip();
					System.out.println(bytesread);
					byte[] bytearray = new byte[bytesread];
					bbr.get(bytearray);
				
					for(byte b: bytearray) {
						System.out.print((char)b);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
			psic.close();
			psoc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


