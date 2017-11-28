package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String parseDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(date);
    }
    public static Timestamp changeDate(Date date){
        Timestamp timestamp=new Timestamp(date.getTime());
        return timestamp;
    }
}
