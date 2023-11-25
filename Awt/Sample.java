package Awt;
import java.awt.*;

import java.awt.event.*;

public class Sample implements ItemListener{
	Checkbox checkbox1=null,checkbox2=null;
	Label l = null;
	CheckboxGroup cbg = null;
	Choice choice=null;
	List list = null;
	Scrollbar s = null;
	
	public static void main(String[] args) {
		new Sample();
	}
	Sample() {
		Frame f = new Frame();
		cbg = new CheckboxGroup();
		
		
		this.l = new Label("text");
		l.setBounds(10,300,120,50);
		l.setAlignment(Label.CENTER);   
		
		this.checkbox1 = new Checkbox("C++",cbg,true);   
		checkbox1.setBounds(10,100,80,50);
		
		this.checkbox2 = new Checkbox("Java",cbg,false);   
		checkbox2.setBounds(10,200,80,50);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		
		choice = new Choice();
		choice.add("C++");
		choice.add("Java");
		choice.add("Python");
		choice.add("Machine");
		choice.add("DB2");
		choice.add("Teradata");
		choice.setBounds(10,550,80,80);
		choice.addItemListener(this);
		
		list = new List(1);
		list.add("C++");
		list.add("Java");
		list.add("Python");
		list.add("DB2",10);
		list.add("Teradata");
		list.setBounds(20,20,10,10);
		list.setSize(10,10);
		list.addItemListener(this);
		list.setMultipleMode(true);
		
		s = new Scrollbar();
		s.setBounds(100,100,50,100);
		
		f.setBounds(400,200,200,200);
		f.setSize(700,700);
		f.setTitle("Sample");  
	
		f.add(l);
		f.add(checkbox1);
		f.add(checkbox2);
		f.add(choice);
		f.add(list);
		f.add(s);
		
		f.setVisible(true);
		f.setLayout(null);
		System.out.println(list.getItemCount());
		String[] listitem = list.getItems();
		for(String s:listitem) {
			System.out.println(s);
		}
		System.out.println(list.getRows());
	}
	
	public void itemStateChanged(ItemEvent ae) {
		//System.out.println(ae.getItem() == checkbox1.getLabel());
		if (ae.getSource() == checkbox1) {
			l.setText(checkbox1.getLabel() + (ae.getStateChange() == 1?" checked":" unchecked"));
		}
		if (ae.getSource() == checkbox2) {
			l.setText(checkbox2.getLabel() + (ae.getStateChange() == 1?" checked":" unchecked"));
		}
		if (ae.getSource() == choice) {
			l.setText(choice.getSelectedItem());
		}
		if (ae.getSource() == list) {
			l.setText(list.getSelectedItem());
		//	list.makeVisible(2);
	//		System.out.println(list.isIndexSelected(1));
		}
		System.out.println(list.isMultipleMode());
	}
}
