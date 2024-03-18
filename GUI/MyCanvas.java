import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class MyCanvas 
extends Canvas {
    Color dotColor;
    
    public void setColor (Color dotColor) {
        this.dotColor = dotColor;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,200,100);
        g.setColor(Color.YELLOW);
        g.fillOval(25,75,50,50);
        g.setColor(Color.WHITE);
        g.fillOval(100,175,20,20);
        g.fillOval(100,165,15,15);
        g.fillOval(116,185,8,8);
        g.fillOval(96,165,15,5);
    }
}
