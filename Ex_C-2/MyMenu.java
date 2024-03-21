import java.awt.*;
import java.awt.event.*;
/**
 * Defines the menu, options, and actions for the canvas background.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class MyMenu
extends MenuBar
implements ActionListener
{
    // MenuBar menuBar;
    Menu backMenu;
    MenuItem backColor1;
    MenuItem backColor2;
    MenuItem backColor3;
    GUI gui;
    randomColor randomizer;

    /**
     * Constructor for objects of class MyMenu
     * @param Takes a GUI object.
     */
    public MyMenu(GUI gui)
    {
        // initialise instance variables
        this.gui = gui;
        backMenu=new Menu("Background");
        backColor1=new MenuItem("White");
        backColor2=new MenuItem("Green");
        backColor3=new MenuItem("Trippy :)");
        backMenu.add(backColor1);
        backMenu.add(backColor2);
        backMenu.add(backColor3);
        this.add(backMenu);
        randomizer = new randomColor();
        
        backColor1.addActionListener(this);
        backColor2.addActionListener(this);
        backColor3.addActionListener(this);
    }

    /**
     * Defines action events for each menu button.
     *
     * @param  takes an ActionEvent.
     * 
     */
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==backColor1) {
            gui.setBackground(Color.WHITE);
        } else if (e.getSource()==backColor2) {
            gui.setBackground(Color.GREEN);
        } else if (e.getSource()==backColor3) {
            gui.setBackground(randomizer.getColor());
        }
    }
}
