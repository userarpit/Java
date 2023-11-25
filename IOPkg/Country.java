package IOPkg;
import java.io.*;
public class Country implements Externalizable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int code;
	
	// getter method
	String getName() {
		return this.name;
	}
	
	int getCode() {
		return this.code;
	}
	
	//setter method
	void setName(String name) {
		this.name = name;
	}
	
	void setCode(int code) {
		this.code = code;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(code);
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = in.readUTF();
		this.code = in.readInt();
		
	}
}