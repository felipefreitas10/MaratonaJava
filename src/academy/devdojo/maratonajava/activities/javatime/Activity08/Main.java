package academy.devdojo.maratonajava.activities.javatime.Activity08;


import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate dt01 = LocalDate.of(2020, 1, 1);
        LocalDate today = LocalDate.now();

        System.out.println(Period.between(dt01, today)); //a data mais antiga e depois a mais recente
    }
}
