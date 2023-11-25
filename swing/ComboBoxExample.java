package swing;

import javax.swing.*;
//import javax.swing.event.ListSelectionEvent;

import javax.swing.event.*;
public class ComboBoxExample {
	JFrame f = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxExample();
	}

	ComboBoxExample() {
		f= new JFrame();
		String country[]={"India","Aus","U.S.A","England","Newzealand"};  
		JComboBox<String> cb=new JComboBox<String>(country);    
	    cb.setBounds(50, 50,150,20);    
	    f.add(cb);
	    
	    String data[][]={ {"101","Amit","670000"},    
                {"102","Jai","780000"},    
                {"101","Sachin","700000"}};    
	    String column[]={"ID","NAME","SALARY"};         
	    JTable jt=new JTable(data,column);   
	    jt.setCellSelectionEnabled(true);
	   // jt.setBounds(210,50,200,300);          
	    
		ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        
        select.addListSelectionListener(new ListSelectionListener() {  
          public void valueChanged(ListSelectionEvent e) {  
        	  System.out.println(select.getSelectedItemsCount());
        	  System.out.println(select.isSelectedIndex(2));
        	  
          }
	});
        
        JScrollPane sp=new JScrollPane(jt);  
	    sp.setBounds(210,50,200,300);
	    f.add(sp);          
	    
	    JScrollBar jsc= new JScrollBar();
	    jsc.setBounds(50,100, 50,100);  
	    f.add(jsc);
	    
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);	
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
