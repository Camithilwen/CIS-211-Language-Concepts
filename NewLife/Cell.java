import java.awt.Rectangle;

/**
 * One cell of the board of the Game of Life.
 * The cell does not communicate with other cells.
 */
public class Cell {
    boolean state;
    int neighbors;
    Rectangle boundingBox;

    public Cell()   {
        state = false;
        neighbors = 0;
        boundingBox = new Rectangle();
    }

    public void setBoundingBox(Rectangle bb) {
        boundingBox = bb;
    }
    
    public Rectangle getBoundingBox () {
        return boundingBox;
    }
    
    public void toggleState () {
        setState ( ! state );
    }
    
    public void setState (boolean newState) {
        state = newState;
    }

    public boolean getState () {
        return state;
    }

    public void setCount (int value) {
        neighbors = value;
    }

    public int getCount () {
        return neighbors;
    }


}
