
public class Presets {
    GameModel model;
    
    public Presets (GameModel model)    {
        this.model = model;
    }
    
    public void preset1 () {
        model.initialize ();
        int rows = model.getNumRows();
        int cols = model.getNumCols();
        if (rows>=3 && cols>=3) { // Stationary block
            model.toggleCell (2,2); 
            model.toggleCell (2,3);
            model.toggleCell (3,2);
            model.toggleCell (3,3);
        }
        if (rows>=9 && cols>=9) {// Here is a spinning bar.
            model.toggleCell (7,7);
            model.toggleCell (7,8);
            model.toggleCell (7,9);
        }
        if (rows>=15 && cols>=15) {// Here is an exploding box.
            model.toggleCell (14,14);
            model.toggleCell (13,14);
            model.toggleCell (15,14);
            model.toggleCell (14,13);
            model.toggleCell (14,15);
        }
        if (rows>=12 && cols >=12) {// Here is a glider.
            model.toggleCell (12,3);
            model.toggleCell (12,4);
            model.toggleCell (12,5);
            model.toggleCell (11,5);
            model.toggleCell (10,4);
        }
        
    }
}
