import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private float xposition, yposition, radius;
    private Color colour;
    private int mood;
    
    private PApplet pen;
    
    public Face (PApplet p, float x, float y)
    {
        xposition=x;
        yposition=y;
        radius=100;
        colour=Color.red;
        pen=p;
                
    }
    public void draw()
    {
        pen.stroke(0);//black outline
        pen.fill(colour.getRed(), colour.getGreen(),colour.getBlue());//head colour
        drawCircle(xposition, yposition, radius, radius);//head
        
        //yellow eyes
        pen.fill(255,255,0);
        drawCircle(xposition-radius/5, yposition-radius/5, radius/4, radius/4);
       
        //mouth - line across and two lines pointing up
        drawLine(xposition-.2*radius, yposition+.3*radius, xposition+.20*radius,yposition+.3*radius);
        drawLine(xposition-.2*radius, yposition+.3*radius, xposition-.25*radius,yposition+.2*radius);
        drawLine(xposition+.2*radius, yposition+.3*radius, xposition+.25*radius,yposition+.2*radius); 
    }
    
    private void drawCircle (float x, float y, float wid, float ht)
    {
        pen.ellipse(x, y, wid, ht);
    }
    
    private void drawLine(double x1, double x2, double y1, double y2)
    {
        pen.line((float)x1, (float)y1, (float)x2, (float)y2);
    } 
    
    public void erase()
    {
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xposition, yposition, radius+5, radius+5);
    }
    
}


//colour new colour=JColorChooser.showDialoge(this, "Select new colour",color.red);
//f.setcolour(new colour);
//f.erase();