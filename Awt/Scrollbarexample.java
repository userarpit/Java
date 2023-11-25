package Awt;
import java.awt.*;
import java.awt.event.*;

public class Scrollbarexample {

	public static void main(String[] args) {
		new Scrollbarexample();  
	}
	
	Scrollbarexample() {
		// TODO Auto-generated method stub
		// creating a frame  
        Frame f = new Frame("Scrollbar Example");    
   // creating a scroll bar  
        Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL);    
        System.out.println(s.getMaximum());
        System.out.println(s.getMinimum());
   // setting the position of scroll bar  
        s.setBounds (100, 100, 100, 100);  
        
   // adding scroll bar to the frame  
        f.add(s);    

   // setting size, layout and visibility of frame  
        f.setSize(400, 400);  
        f.setLayout(null);    
        f.setVisible(true);   
        
        s.addAdjustmentListener(new AdjustmentListener() {    
            public void adjustmentValueChanged(AdjustmentEvent e) {    
               System.out.println("Vertical Scrollbar value is:"+ s.getValue());    
            }    
        });    
	}

}
