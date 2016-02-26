/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        new FilledRectanglePrinter(10,5).drawRectangle();

        System.out.println();
        System.out.println();

        new SimpleRectanglePrinter(12,4).drawRectangle();
    }
}
