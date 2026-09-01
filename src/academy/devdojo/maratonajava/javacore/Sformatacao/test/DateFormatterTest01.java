package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //format -> transforma um objeto em uma string
        //parse -> transforma uma string em um objeto

        LocalDate parse1 = LocalDate.parse("20260901", DateTimeFormatter.BASIC_ISO_DATE); //se a string passada nãoestiver na mesma formatação ou então se não for passado a formatação, lançará uma exceção
        LocalDate parse2 = LocalDate.parse("2026-09-01+01:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-09-01", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        //Também serve para LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2021-02-19T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        //também podemos "criar" o nosso próprio formato
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s5 = LocalDate.now().format(formatterBR);
        System.out.println(s5);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY); //Também é possível passar o local
        String s6 = LocalDate.now().format(formatterGR);
        System.out.println(s6);

        //Obviamente também consiguimos fazer o parse com esses formatos criados
        LocalDate parse5 = LocalDate.parse("07.September.2026", formatterGR);

        System.out.println(parse5);



    }

}
