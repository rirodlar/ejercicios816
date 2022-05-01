package pe.joedayz.horaFecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HolaFecha {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();

        ZonedDateTime z = ZonedDateTime.now();

        LocalDateTime df = LocalDateTime.of(d,t);

        var dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm a z Z");

        System.out.println(z.format(dtf));

        var g3 = DateTimeFormatter.ofPattern(" 'TEST' hh:mm YYYY");
        System.out.println(df.format(g3));
//
//        DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
//        System.out.println(s.format(new Date()));


        //formato fecHA Y HORA

        //DateTimeFormatter
    }
}
