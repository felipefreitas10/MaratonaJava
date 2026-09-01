package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain.Local;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(18, 45, 34);
        System.out.println(time);

        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        //Assim como LocalDate o LocalTime também apresenta vários metodos que podem nos auxiliar
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        System.out.println(LocalTime.MAX); //A "maior" hora do dia
        System.out.println(LocalTime.MIN); //A "menor" hora do dia
    }
}
