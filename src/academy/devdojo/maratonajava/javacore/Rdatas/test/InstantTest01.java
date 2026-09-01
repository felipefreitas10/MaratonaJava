package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); //comportamento semelhante ao date, porém trabalha em nanosegundos e não apresenta fuso horário
        System.out.println(now);
        System.out.println(now.getEpochSecond()); //pega os segundos
        System.out.println(now.getNano()); //pega os nanos segundos

        System.out.println(Instant.ofEpochSecond(3)); //adiciona 3 segundos na época padrão do Java
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));

    }
}
