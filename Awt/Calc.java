/**
 * 
 */
package Awt;
import java.awt.*;
import java.awt.event.*;

/**
 * @author masterarpit
 *
 */
public class Calc implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc s = new Calc();
	}
	
	TextField tf1 = null;
	Button add=null,sub=null,mul=null,div=null,equal=null,clear=null;
	Frame f = null;
	
	Calc(){
		this.f = new Frame();
		this.add = new Button("+");
		this.sub = new Button("-");
		this.mul = new Button("*");
		this.div = new Button("/");
		this.equal = new Button("=");
		this.clear = new Button("c");
		
		this.tf1 = new TextField();
		
		
		tf1.setBounds(100,100,200,30);
		
		add.setBounds(100,150,30,30);
		sub.setBounds(140,150,30,30);
		mul.setBounds(180,150,30,30);
		div.setBounds(220,150,30,30);
		equal.setBounds(100,190,30,30);
		clear.setBounds(140,190,30,30);	
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		
		f.setBounds(400,200,80,80);
		f.setSize(400,400);
		f.setTitle("Calculator");   
		
		f.add(tf1);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
		f.add(equal);
		f.add(clear);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		int a;
		int b;
		if (ae.getSource() == add) {
			tf1.setText(tf1.getText() + "+");	
		}	
		
		if (ae.getSource() == sub) {
			tf1.setText(tf1.getText() + "-");	
		}
		
		if (ae.getSource() == mul) {
			tf1.setText(tf1.getText() + "*");	
		}
		
		if (ae.getSource() == div) {
			tf1.setText(tf1.getText() + "/");	
		}
		
		if (ae.getSource() == equal) {
				String s = tf1.getText();
				int plus = s.indexOf('+');
				int minus = s.indexOf('-');
				int multiply = s.indexOf('*');
				int division = s.indexOf('/');
				
				if(plus !=-1) {
					if (minus != -1 | multiply != -1 | division != -1 | plus == 0) {
						tf1.setText("Invalid input");
					}
					else {
						a = Integer.parseInt(s.substring(0, plus));
						b = Integer.parseInt(s.substring(plus+1, s.length()));
						tf1.setText(String.valueOf(a+b));
					}	
				}
				
				else if(minus !=-1) {
					if (plus != -1 | multiply != -1 | division != -1 | minus == 0) {
						tf1.setText("Invalid input");
					}
					else {
						a = Integer.parseInt(s.substring(0, minus));
						b = Integer.parseInt(s.substring(minus+1, s.length()));
						tf1.setText(String.valueOf(a-b));
					}
				}
				
				else if(multiply !=-1) {
					if (minus != -1 | plus != -1 | division != -1 | multiply == 0) {
						tf1.setText("Invalid input");
					}
					else {
						a = Integer.parseInt(s.substring(0, multiply));
						b = Integer.parseInt(s.substring(multiply+1, s.length()));
						tf1.setText(String.valueOf(a*b));
					}
				}
				
				else if(division !=-1) {
					if (minus != -1 | multiply != -1 | plus != -1 | division == 0) {
						tf1.setText("Invalid input");
					}
					else {
						a = Integer.parseInt(s.substring(0, division));
						b = Integer.parseInt(s.substring(division+1, s.length()));
						double c = 0.0;
						try {
							c = a/b;	
							tf1.setText(String.valueOf(c));
						}
						catch(ArithmeticException e) {
							tf1.setText("division by 0 not allowed");
						}
						
					}
				}
		}		
		if (ae.getSource() == clear) {
			tf1.setText("");	
		}
	}
}
