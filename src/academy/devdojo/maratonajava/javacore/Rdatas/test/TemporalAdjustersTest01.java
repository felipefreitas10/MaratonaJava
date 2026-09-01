package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)); //retorna a mesma data se for tuesday ou a próxima tuesday
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)); //retorna a próxima tuesday
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth()); //retorna o último dia do ano
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = now.with(TemporalAdjusters.lastDayOfMonth()); //retorna o último dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = now.with(TemporalAdjusters.firstDayOfNextYear()); //retorna o primeiro dia do próximo ano
        System.out.println(now);
        System.out.println(now.getDayOfWeek());





    }
}
