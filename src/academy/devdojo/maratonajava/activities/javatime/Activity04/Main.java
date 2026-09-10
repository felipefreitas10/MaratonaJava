package academy.devdojo.maratonajava.activities.javatime.Activity04;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args){
        LocalTime startStudies = LocalTime.of(20, 30, 30);

        System.out.println(startStudies.isAfter(LocalTime.of(21,00,00)));

        startStudies = startStudies.plusMinutes(90); //Imutável -> logo, reajuste da referência

        System.out.println(startStudies.isAfter(LocalTime.of(21,00,00)));

    }
}
