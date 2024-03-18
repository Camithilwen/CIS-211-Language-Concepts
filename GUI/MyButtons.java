import java.awt.*;
import java.awt.event.*;
public class MyButtons 
extends Panel 
implements ActionListener {
    Button button1, button2, button3; // instance variables
    GUI gui;
    
    public MyButtons(GUI gui)    {
        this.gui = gui;
        button1 = new Button("Yellow Dot");
        button2 = new Button("Red Dot");
        button3 = new Button("Blue Dot");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == button1) {
            gui.setColor(Color.YELLOW);
        } else if (e.getSource() == button2) {
            gui.setColor(Color.RED);
        } else if (e.getSource() == button3) {
            gui.setColor(Color.BLUE);
        }
    }
}
