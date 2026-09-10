package academy.devdojo.maratonajava.activities.javatime.Activity09;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.now();
        LocalDate ldt02 = LocalDate.of(2024, 1,1);

        System.out.println("2026 é bissexto? " + ldt.isLeapYear());
        System.out.println("2024 é bissexto? " + ldt02.isLeapYear());
    }
}
