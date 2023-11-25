package Awt;
import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample extends WindowAdapter{
	Frame f =null;
	
	public static void main(String[] args) {
		new WindowAdapterExample();
	}
	
	WindowAdapterExample() {
		f= new Frame();
		f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true); 
        f.addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}
