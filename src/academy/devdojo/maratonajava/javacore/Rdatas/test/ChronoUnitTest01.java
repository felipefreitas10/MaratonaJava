package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        //ChronoUnit resolve o problema do Period
        LocalDateTime aniversary = LocalDateTime.of(2005, Month.JULY, 12, 3, 12, 30);
        LocalDateTime now = LocalDateTime.now();

        LocalTime threeHoursAgo = LocalTime.now().plusHours(-3);
        LocalTime nowInHours = LocalTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversary, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversary, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversary, now));
        System.out.println(ChronoUnit.YEARS.between(aniversary, now));
        System.out.println(ChronoUnit.HOURS.between(aniversary, now));


        //Compara também horas -> logo podemos trabalhas com LocalDate, LocalTime e LocalDateTime.
        System.out.println(ChronoUnit.MINUTES.between(threeHoursAgo, nowInHours));
    }
}
