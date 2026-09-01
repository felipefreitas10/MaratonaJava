package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        //Para quantidade de tempo entre datas usamos a classe Period
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(8);

        //Só aceita LocalDates
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(58);
        Period p5 = Period.ofYears(2);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        //não conseguimos extrair meses a partir de dias e nem a partir de anos
        System.out.println(p3.getMonths());
        System.out.println(p5.getMonths());
    }
}
