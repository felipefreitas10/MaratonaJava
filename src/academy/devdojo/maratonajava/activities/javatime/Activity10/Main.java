package academy.devdojo.maratonajava.activities.javatime.Activity10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {;

        String data = "25/12/2026";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate ldt = LocalDate.parse(data, dtf); //passa a data e o formato

        System.out.println(ldt);

        ldt = ldt.plusDays(1);

        System.out.println(ldt);

        System.out.println(dtf.format(ldt));







    }
}
