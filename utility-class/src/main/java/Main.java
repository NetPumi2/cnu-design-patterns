import java.text.ParseException;
import java.util.Date;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        System.out.println(DateFormatUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm"));

        String formattedDate = "6/23/1999";
        System.out.println(DateFormatUtils.parseDate(formattedDate, "M/d/yyy"));
    }
}
