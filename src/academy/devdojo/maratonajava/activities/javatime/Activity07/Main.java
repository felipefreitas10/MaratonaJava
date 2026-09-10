package academy.devdojo.maratonajava.activities.javatime.Activity07;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dtToday = LocalDate.now();
        LocalDate lastDayOfYear = LocalDate.of(2026, Month.DECEMBER, 31);

        System.out.println("Faltam " + ChronoUnit.DAYS.between(dtToday, lastDayOfYear) + " dias para o ano acabar."); // -> no parâmetro a data mais antiga e depois a mais recente

    }
}
