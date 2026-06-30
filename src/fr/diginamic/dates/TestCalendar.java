package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {
    static void main() {

        Calendar cal = new GregorianCalendar(2016, Calendar.MAY, 19, 23, 59, 30);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));

        System.out.println("————————————————————");

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd '—' hh:mm:ss");
        Date date2 = calendar.getTime();
        System.out.println(sdf2.format(date2));

        System.out.println("————————————————————");

        LocalDate localDate = LocalDate.now();
        String dateFR = localDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE));
        System.out.println("France : " + dateFR);
        String dateRU = localDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.of("ru", "RU")));
        System.out.println("Russie : " + dateRU);
        String dateCN = localDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.TRADITIONAL_CHINESE));
        System.out.println("Chine : " + dateCN);
        String dateDE = localDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.GERMANY));
        System.out.println("Allemagne : " + dateDE);
    }
}
