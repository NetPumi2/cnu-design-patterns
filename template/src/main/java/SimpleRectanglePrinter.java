/**
 * Created by crhonek on 26.2.2016.
 */
public class SimpleRectanglePrinter extends AbstractRectanglePrinter {

    public SimpleRectanglePrinter(int columns, int rows) {
        super(columns, rows);
    }

    @Override
    protected void drawFirstLine() {
        System.out.print("/");
        for (int i=1;i<getColumns()-1;i++){
            System.out.print("-");
        }
        System.out.println("\\");
    }

    @Override
    protected void drawBodyLines() {
        System.out.print("|");
        for (int i=1;i<getColumns()-1;i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }

    @Override
    protected void drawLastLine() {
        System.out.print("\\");
        for (int i=1;i<getColumns()-1;i++){
            System.out.print("-");
        }
        System.out.println("/");
    }
}
