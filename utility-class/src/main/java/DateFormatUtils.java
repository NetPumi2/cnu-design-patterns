import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by crhonek on 26.2.2016.
 */
public final class DateFormatUtils {

    private DateFormatUtils(){
    }

    public static String formatDate(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(date);
        return formattedDate;
    }

    public static Date parseDate(String formattedDate, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date parsedDate = sdf.parse(formattedDate);
        return parsedDate;
    }

}
