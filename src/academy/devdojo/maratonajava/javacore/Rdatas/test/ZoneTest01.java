package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //retorna as listas dos ZonesIds que o Java suporta
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); //O meu zoneId padrão

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); //tem que passar a zona certa se não recebemos uma exceção
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone); //nosso horário nessa zona
        System.out.println(zonedDateTime);

        //Quando usamos instant ele retorna o horário nessa zona e não a diferença
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        //ZoneOffSet -> guarda o deslocamento UTC
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00"); //temos que passar nessa mesma exceção c.c. recebemos uma exceção
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus); //Quando passamos offset temos um objeto OffsetDateTime
        System.out.println(offsetDateTime);

        //apenas outro jeito de fazer a mesma coisa
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        //Também podemos saber o quanto equivale uma data em um calandário
        JapaneseDate japaneseDate1 = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate1); //a data no calendário japones

        //passamos uma data no calendário gregoriano para obter no calendário japones
        LocalDate mijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate mijiEra = JapaneseDate.from(mijiEraLocalDate);
        System.out.println(mijiEra);




    }

}
