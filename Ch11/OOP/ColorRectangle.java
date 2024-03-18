import java.awt.Color;
import java.awt.Rectangle;

public class ColorRectangle  extends Rectangle {
// extends Object {   // optional, but compiler inserts it
  
     // instance variables, also called attributes
    private int x, y, w, h;
    private Color color;
    
    // constructor
    public ColorRectangle (int x, int y, int w, int h) {
        // save parameter values in instance variables
        // instance_variable = parameter_value
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = Color.GREEN;
    }
    
    // SETTER and GETTER (vernacular)
    // MUTATOR and ACCESSOR (official words from Object Oriented Theory)
    
    public void setColor (Color c) {
        
        if(c != null) {
        this.color = c;
    }
    }
    
    public Color getColor () {
        
        return this.color;
    }
    
    @Override
    public String toString () {
        return "Rect width=" + w + " height=" +h;
    }
    
    public boolean equals (ColorRectangle other) {
        return this.w == other.w && this.h == other.h;
        
    }
}
