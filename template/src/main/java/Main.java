import java.util.ArrayList;
import java.util.List;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        List<AbstractRectanglePrinter> printers = new ArrayList<>(2);
        printers.add(new FilledRectanglePrinter(15,5));
        printers.add(new SimpleRectanglePrinter(15,6));

        for (AbstractRectanglePrinter printer : printers) {
            printer.drawRectangle();
        }
    }
}
