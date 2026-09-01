package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.Date;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        for (int i = 0; i < 1000000; i++) {
            System.out.println();
        }
        LocalTime now2 = LocalTime.now();
        Duration d1 = Duration.between(now, now2);
        long seconds = d1.getSeconds();
        System.out.println(seconds);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraAposDoisAnos = agora.plusYears(2).plusMinutes(8);

        Duration d2 = Duration.between(agora, agoraAposDoisAnos);
        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofHours(35); //retorna quantas horas após o agora
        System.out.println(d4);
        Duration d5 = Duration.ofMinutes(3); //retorna quantas horas após o agora, se não for hora retorna minutos
        System.out.println(d5);
        Duration d6 = Duration.ofDays(7); //retorna quantas horas após o agora
        System.out.println(d6);




    }
}
