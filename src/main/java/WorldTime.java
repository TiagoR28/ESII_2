import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorldTime {
    public static void main(String[] args) {
        /**
         * MUDANÇA DE TIMEZONE
         */
        DateTime currentTime = new DateTime(DateTimeZone.forID("Europe/Lisbon"));
        System.out.println("Portugal: " + currentTime.getHourOfDay() + ":" + currentTime.getMinuteOfHour());
        DateTime amsterdam = currentTime.withZone(DateTimeZone.forID("Europe/Amsterdam"));
        System.out.println("Amsterdam: " + amsterdam.getHourOfDay() + ":" + amsterdam.getMinuteOfHour());


        //hello

        System.out.println("HELLO WORLD!!!!");
    }


}


