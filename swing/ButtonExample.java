package swing;
import javax.swing.*;
import java.awt.event.*;
public class ButtonExample{
	JRadioButton jrb1 = null,jrb2=null;
	public static void main(String[] args) {
		new ButtonExample();
	}
		ButtonExample() {
		JFrame f = new JFrame();
		JTextField tf = new JTextField();
		JTextArea ta = new JTextArea("Welcome to javatpoint"); 
		ta.setBounds(50,170,100,100);
		tf.setBounds(200,50,70,50);
		Icon icon = new ImageIcon("business.png");
		
		JLabel l = new JLabel("Business");
		l.setBounds(300,50,70,50);
		l.setHorizontalAlignment(JLabel.LEFT);
		
		JButton b= new JButton("Click",icon);
		b.setBounds(50,50,100,100);
		b.setMnemonic(2);
	
		JPasswordField jpf = new JPasswordField(3);
		jpf.setBounds(50,300,50,50);
		
		JCheckBox checkbox1 = new JCheckBox();
		checkbox1.setBounds(50,360,50,50);
		
		jrb1 = new JRadioButton("Male:");
		jrb2 = new JRadioButton("Female:");
		jrb2.setMnemonic(KeyEvent.VK_0);
		ButtonGroup group = new ButtonGroup();
		group.add(jrb1);
		group.add(jrb2);
		jrb1.setSelected(true);
		jrb1.setBounds(50,420,70,20);
		jrb2.setBounds(120,420,120,20);
		
		
		f.add(b);
		f.add(tf);
		f.add(l);
		f.add(ta);
		f.add(jpf);
		f.add(checkbox1);
		f.add(jrb1);
		f.add(jrb2);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);	
		//f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome");
				//JOptionPane.showMessageDialog(l,e.getSource());  
				if(jrb1.isSelected()) {
					JOptionPane.showMessageDialog(f,"you are male");
				}
				
				if(jrb2.isSelected()) {
					JOptionPane.showMessageDialog(f,"you are female");
				}
			}
		});
	}
	
	
}