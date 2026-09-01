package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(2222, Month.APRIL, 12, 12, 45, 21);
        System.out.println(localDateTime);
        System.out.println(ldt);

        //As classe LocalDate e LocalTime apresentam o metodo parse que é capaz de transformar uma String em data ou hora
        LocalDate date = LocalDate.parse("2026-08-08");
        LocalTime time = LocalTime.parse("23:18:21");

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time); //pega da data e "junta" o horário passado retornando um LoalDateTime
        LocalDateTime ldt2 = time.atDate(date); //pega o horário e "junta" a data passado retornando um LoalDateTime



    }
}
