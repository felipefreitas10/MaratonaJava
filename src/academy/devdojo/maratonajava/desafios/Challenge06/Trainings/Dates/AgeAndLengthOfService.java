package academy.devdojo.maratonajava.desafios.Challenge06.Trainings.Dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeAndLengthOfService {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("Informe a sua data de nascimento no formato dd/MM/yyyy: ");
        date = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate01 = LocalDate.parse(date, dtf);

        System.out.println(localDate01);

        Period period01 = Period.between(localDate01, LocalDate.now());

        System.out.println("Período vivido " + period01);

        System.out.println("Dias vividos: " + ChronoUnit.DAYS.between(localDate01, LocalDate.now()));


    }
}
