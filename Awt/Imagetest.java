package Awt;
import java.awt.*;
import java.awt.event.*;

public class Imagetest implements MouseListener,MouseMotionListener{
	Frame f= null;
	public static void main(String[] args){
		new Imagetest();
		
	}

	Imagetest() {
		f= new Frame();
		f.setSize(400,400);    
	    f.setLayout(null);    
	    f.setVisible(true); 
	    f.addMouseListener(this);
		f.addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent e) {  
	    		  Graphics g=f.getGraphics();  
	    	      g.setColor(Color.BLUE);  
	    	      g.fillOval(e.getX(),e.getY(),30,30);  
    }
	    	
   	public void mouseEntered(MouseEvent e) {  
	 //   		System.out.println("Mouse Entered");
	}
	    	
	public void mouseExited(MouseEvent e) {  
				//System.out.println("Mouse Exited");
	}
	    	
	public void mousePressed(MouseEvent e) {  
	    		System.out.println("Mouse Pressed");
	}
	
	public void mouseReleased(MouseEvent e) {  
	    		System.out.println("Mouse Released");
	}
	public void mouseDragged(MouseEvent e) {  
	    		Graphics g=f.getGraphics();  
	    	      g.setColor(Color.ORANGE);  
	    	      g.fillOval(e.getX(),e.getY(),30,30); 
	}
	public void mouseMoved(MouseEvent e) {
	//    		System.out.println("mouse moved");
	}	 
}