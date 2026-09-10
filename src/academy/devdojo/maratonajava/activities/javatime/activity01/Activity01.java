package academy.devdojo.maratonajava.activities.javatime.activity01;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Activity01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate aniversary = LocalDate.of(2005, Month.JULY, 12);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Today is " + df.format(today));
        System.out.println("I was born at " + df.format(aniversary));



    }
}
