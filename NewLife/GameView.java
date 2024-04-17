import java.awt.*;
/**
 * GameView is a canvas containing a matrix of rectangles.
 * Every rectangle has a position.
 * Rectangles do not overlap.
 * Every rectangle has a state: on or off.
 * When the canvas paints, rectangles are colored by their state.
 */
public class GameView extends Canvas {
    Color liveColor, deadColor;
    int rows, cols, pixels;
    GameModel model;
    
    public GameView (GameModel model) {
        this.liveColor = Color.blue;
        this.deadColor = Color.white;
        this.model = model;
        this.rows = model.getNumRows();
        this.cols = model.getNumCols();
        this.pixels = model.getNumPixels();
        // resize the canvas
        setSize(rows*pixels, cols*pixels); 
    }

    public void paint (Graphics g) {
        int r,c;
        Rectangle rec;
        boolean state;
        for (r=0; r<rows; r++) {
            for (c=0; c<cols; c++) {
                Cell cell = model.getCell (r,c);
                state = cell.getState();
                if (state) {
                    g.setColor(liveColor);
                } else {
                    g.setColor(deadColor);
                }
                Rectangle bb = cell.getBoundingBox();
                g.fillRect(bb.x, bb.y, bb.width, bb.height);
            }
        }
    }

    public void toggleCellAtPoint (Point p) {
        int r,c;
        for (r=0; r<rows; r++) {
            for (c=0; c<cols; c++) {
                Cell cell = model.getCell (r,c);
                Rectangle bb = cell.getBoundingBox();
                if (bb.contains(p)) {
                    cell.toggleState();
                }
            }
        }
    }
}

