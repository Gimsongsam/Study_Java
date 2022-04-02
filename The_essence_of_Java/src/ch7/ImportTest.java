package ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();    // import java.util.Date;
        // java.util.Date today = new java.util.Date()

        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd"); // import java.text.SimpleDateFormat;
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        // java.text.SimpleDateFormat date = new java.text.SimpleDateFormat("yyyy/mm/dd");
        // java.text.SimpleDateFormat date = new java.text.SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));

        System.out.println("today: " + today);
    }
}
