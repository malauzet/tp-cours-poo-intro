package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    static void main() {

        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf1.format(date));

        Date date2 = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf2.format(date2));

        Date date3 = new Date();
        System.out.println(sdf2.format(date3));
    }
}
