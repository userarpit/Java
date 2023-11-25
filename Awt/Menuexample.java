package Awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Menuexample {
	public static void main(String[] args) {
		new Menuexample();
	}

	Menuexample() {
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");
		Menu source = new Menu("Source");
		Menu refactor = new Menu("Refactor");
		
//file submenu
		Menu New = new Menu("New");
//New submenu
		MenuItem Newproject= new MenuItem("Project...");
		MenuItem example= new MenuItem("Example...");
		
		New.add(Newproject);
		New.add(example);
		
		MenuItem openfile = new MenuItem("Open File...");
		MenuItem exit = new MenuItem("Exit");
		
		file.add(New);
		file.add(openfile);
		file.add(exit);
		
		
		mb.add(file);
		
//Edit menu item
		MenuItem cut = new MenuItem("Cut");
		cut.setActionCommand("Cut");
		MenuItem copy = new MenuItem("Copy");
		copy.setActionCommand("Copy");
		MenuItem paste = new MenuItem("Paste");
		paste.setActionCommand("Paste");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		
		mb.add(edit);
		mb.add(source);
		mb.add(refactor);
		
		
		Frame f = new Frame();
		f.setMenuBar(mb);
		f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
        
        exit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent ae) {
        		Runtime.getRuntime().exit(0);
        	}
        });
	}
}
