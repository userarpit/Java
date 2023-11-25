package Awt;
import java.awt.*;
import java.awt.event.*;

public class KeyExample implements KeyListener{
	Frame f = null;
	TextArea ta = null;
	public static void main(String[] args) {
		new KeyExample();
	}
	KeyExample(){
		ta = new TextArea();
		ta.setBounds(50,50,50,50);
		f = new Frame();
		f.add(ta);
		ta.addKeyListener(this);
		f.setSize(400,400);    
	    f.setLayout(null);    
	    f.setVisible(true);
	}
	
	public void keyPressed (KeyEvent e) {    
        System.out.println("Key Pressed");    
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
    	System.out.println("Key Released");    
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
    	System.out.println("Key Typed");    
    }    
}
