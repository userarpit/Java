package Network;
import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss;
		Socket s;
		
		try {
			ss = new ServerSocket(6666);
			s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			String str="",str2="";
			while(!str.equals("stop")) {
				str=din.readUTF();
				System.out.println("Client says " + str);
				str2 = br.readLine();
				dout.writeUTF(str2);
				dout.flush();
				
				
			}
			dout.close();
			br.close();
			din.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}