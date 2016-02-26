/**
 * Created by crhonek on 26.2.2016.
 */
public abstract class AbstractRectanglePrinter {

    private final int columns;
    private final int rows;

    public AbstractRectanglePrinter(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void drawRectangle(){
        if(rows == 1){
            drawFirstLine();
        } else if(rows == 2){
            drawFirstLine();
            drawLastLine();
        } else if(rows > 2) {
            drawFirstLine();
            for(int i=1;i<getRows()-1; i++){
                drawBodyLines();
            }
            drawLastLine();
        }
    }

    protected abstract void drawFirstLine();

    protected abstract void drawBodyLines();

    protected abstract void drawLastLine();


}
