package homework21.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        convertDate();
    }

    public static void convertDate() {
        Date input = new Date();
        LocalDate localDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime localDateTime = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalTime localTime = input.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        System.out.println(input);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);
    }
}
