package Awt;
import java.awt.*;
import java.awt.event.*;
public class PanelExample {
	public static void main(String[] args){
		new PanelExample();
	}
	PanelExample() {
		Frame f= new Frame();
		Panel p = new Panel();
		Button A= new Button("A");
		Button B = new Button("B");
		
		
		p.setBounds(40,40,80,80);
		p.setBackground(Color.gray);
		
		A.setBounds(20,20,20,20);
		A.setBackground(Color.blue);
		B.setBounds(20,50,20,20);
		B.setBackground(Color.yellow);
		
		p.add(A);
		p.add(B);
		
		f.add(p);  
	    f.setSize(400,400);    
	    f.setLayout(null);    
	    f.setVisible(true);  
	    
	    A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent ae) {
        		f.setIconImage(Toolkit.getDefaultToolkit().getImage("W.jpeg"));
        	}
        });
	}
 }
