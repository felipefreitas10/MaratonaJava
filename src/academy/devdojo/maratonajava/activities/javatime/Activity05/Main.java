package academy.devdojo.maratonajava.activities.javatime.Activity05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2026, Month.SEPTEMBER, 07, 8, 00, 00);

        ldt = ldt.plusHours(4).plusMinutes(30);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(df.format(ldt));


    }
}
