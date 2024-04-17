import java.awt.Rectangle;

/**
 * GameModel manages the game board and all its cells.
 */
public class GameModel {
    Cell [][] allCells;
    int rows, cols, pixels;
    static final int MINIMUM=2;
    static final int MAXIMUM=3;
    static final int IDEAL=3;
    boolean stopSignal = true;
    boolean statesComplete = false;
    boolean countsComplete = false;

    /**
     * Constructor.
     */
    public GameModel (int rows, int cols, int pixels_per_cell) {
        this.rows = rows;
        this.cols = cols;
        this.pixels = pixels_per_cell;
        allCells = new Cell [rows] [cols];
        initialize();
    }
    
    protected void initialize() {
        Cell cell;
        int x,y, width,height;
        width = pixels-1; 
        height = pixels-1; 
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cell = new Cell();
                allCells[r][c]=cell;
                x = c*pixels;
                y = r*pixels;
                Rectangle bb = new Rectangle(x,y,width,height);
                cell.setBoundingBox(bb);
            }
        }
    }

    public Cell getCell(int row, int col) {
        return allCells[row][col];
    }
    
    public void toggleCell(int row, int col) {
        Cell cell = getCell(row,col);
        cell.toggleState();
    }
    
    public int getNumRows () {
        return rows;
    }

    public int getNumCols () {
        return cols;
    }

    public int getNumPixels () {
        return pixels;
    }
    
    public void advanceOneGeneration () {
        updateCounts(); 
        updateStates();
    }

    protected int countNeighbor(int r, int c) {
        if (r>=0 && r<rows) {
            if (c>=0 && c<cols) {
                Cell cell = allCells[r][c];
                if (cell.getState()) {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    protected int countNeighbors(int r, int c) {
        int count = 0;
        count += countNeighbor(r-1,c-1);
        count += countNeighbor(r-1,c+0);
        count += countNeighbor(r-1,c+1);
        count += countNeighbor(r+0,c-1);
        count += countNeighbor(r+0,c+1);
        count += countNeighbor(r+1,c-1);
        count += countNeighbor(r+1,c+0);
        count += countNeighbor(r+1,c+1);
        return count;
    }
    
    protected void updateCounts() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                Cell cell = allCells[r][c];
                cell.setCount(countNeighbors(r,c));
            }
        }
        countsComplete = true;
    }
    
    protected void updateStates() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                Cell cell = allCells[r][c];
                int count = cell.getCount();
                boolean state = cell.getState();
                if (state) {
                    if (count<MINIMUM || count>MAXIMUM) {
                        cell.setState(false);
                    }
                } else {
                    if (count==IDEAL) {
                        cell.setState(true);
                    }
                }
            }
        }
        statesComplete = true;
    }
}