import processing.core.PApplet;
import javax.swing.JOptionPane;
import g4p_controls.*;

public class FaceMaker extends PApplet
{
	Face f;
        GButton button1;
        GButton button2;
        GButton button3;
        GButton button4;
        float x,y;
        
        public void setup()
        {
            setSize(400,400);
            background(255);
            
            f=new Face(this, 200,200);
           
            button1= new GButton(this,22,20,80,30);
            button1.setText("Move Face");
            
            button2= new GButton(this,119,20,80,30);
            button2.setText("Resize Face");
            
            button3= new GButton(this,217,20,80,30);
            button3.setText("Change Colour");
           
            button4= new GButton(this,311,20,80,30);
            button4.setText("Set Mood");
        }
        
        public void handleButtonEvents(GButton button, GEvent event)
        {
            if (button==button1)
            {
                //ask for a new x,y location
                x =Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new x location: "));
                y =Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new y location: "));
                
                //move to new locations
                f.erase();
                f.move(x,y);
            }  
            
        }
        
        public void draw()
        {
            f.draw();
        }

}