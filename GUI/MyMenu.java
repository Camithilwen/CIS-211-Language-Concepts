import java.awt.*;
import java.awt.event.*;
public class MyMenu 
extends MenuBar 
implements ActionListener {
    //MenuBar menuBar;
    Menu backMenu;
    MenuItem backColor1;
    MenuItem backColor2;
    MenuItem backColor3;
    GUI gui;
    public MyMenu (GUI gui) {
        this.gui=gui; 
        backMenu=new Menu("Background");  
        backColor1=new MenuItem("White");  
        backColor2=new MenuItem("Yellow");  
        backColor3=new MenuItem("Green");
        backMenu.add(backColor1);  
        backMenu.add(backColor2);  
        backMenu.add(backColor3);
        this.add(backMenu); 
        
        backColor1.addActionListener(this);
        backColor2.addActionListener(this);
        backColor3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==backColor1) {
            gui.setBackground(Color.WHITE);
        } else if (e.getSource()==backColor2) {
            gui.setBackground(Color.YELLOW);
        }
        else if (e.getSource()==backColor3) {
            gui.setBackground(Color.GREEN);
        }
    }
}

