import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

/**
 * Conway's Game of Life.
 * Set up objects.
 * Start the game.
 */
public class GameOfLife 
extends MouseAdapter 
implements ActionListener {
    Button nextButton;
    Button presetButton;
    Button runButton;
    Button stopButton;
    GameView gameView;
    GameModel gameModel;
    JFrame frame;
    final static int GRID_SIZE = 20; // in cells
    final static int CELL_SIZE = 20; // in pixels
    
    public static void main () {
        main(null);
    }
    public static void main (String [] args) {
        GameOfLife game = new GameOfLife();
    }
    
    public GameOfLife () {
        frame = new JFrame("Game");
        frame.setVisible(false);
        frame.setLayout(new FlowLayout());
        frame.setBackground(Color.green);

        gameModel = new GameModel(GRID_SIZE,GRID_SIZE,CELL_SIZE);
        gameView = new GameView(gameModel);
        gameView.addMouseListener(this);
        frame.add(gameView);

        Panel buttons = new Panel();
        buttons.setLayout(new FlowLayout());
        presetButton = new Button ("PRESET");
        presetButton.addActionListener(this);
        buttons.add(presetButton);
        nextButton = new Button ("NEXT");
        nextButton.addActionListener(this);
        buttons.add(nextButton);  
        runButton = new Button("RUN");
        runButton.addActionListener(this);
        buttons.add(runButton);
        stopButton = new Button("STOP");
        stopButton.addActionListener(this);
        buttons.add(stopButton);
        frame.add(buttons);

        frame.pack();
        frame.setVisible(true);
    }
        
    public void actionPerformed (ActionEvent e) {
        Object src = e.getSource();
        if (src == nextButton) {
            gameModel.advanceOneGeneration();
            gameView.repaint();
        } else if (src == presetButton) {
            Presets presets = new Presets(gameModel);
            presets.preset1();
            gameView.repaint();
        } else if (src == runButton) {
            gameModel.stopSignal = false;
            run();
        } else if (src == stopButton) {
            gameModel.stopSignal = true;
        }

    }
    
    public void mouseClicked(MouseEvent me)    {
        Point p = me.getPoint();
        gameView.toggleCellAtPoint(p);
        gameView.repaint();
    }
    
    public void run() {
        for(int i = 0; i < 3; i++) {
                if(gameModel.stopSignal = false) {
                    gameModel.advanceOneGeneration();
                    gameView.repaint();
                    i = 0;
                }
            }
    }
}
