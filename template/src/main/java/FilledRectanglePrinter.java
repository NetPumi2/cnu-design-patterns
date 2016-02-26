/**
 * Created by crhonek on 26.2.2016.
 */
public class FilledRectanglePrinter extends AbstractRectanglePrinter {

    public FilledRectanglePrinter(int columns, int rows) {
        super(columns, rows);
    }

    @Override
    protected void drawFirstLine() {
        fillLine();
    }

    private void fillLine() {
        for (int i=0;i<getColumns();i++){
            System.out.print("X");
        }
        System.out.println();
    }

    @Override
    protected void drawBodyLines() {
        fillLine();
    }

    @Override
    protected void drawLastLine() {
        fillLine();
    }
}
