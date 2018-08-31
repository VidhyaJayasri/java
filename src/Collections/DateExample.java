package Collections;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;

/**
 * Created by expert on 24/7/18.
 */
public class DateExample
{
    public static void main(String[] args)
    {
        ////Date today;
        SimpleDateFormat sdf;

        Date date =new Date();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd");

       // System.out.println(today);
        System.out.println(dt.format(date));
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime time=LocalTime.now();
        System.out.println(time);

        GregorianCalendar cal=new GregorianCalendar();
        int year=cal.get(GregorianCalendar.YEAR);

        System.out.println(year);

        System.out.println(cal.getTime());

    }
}
