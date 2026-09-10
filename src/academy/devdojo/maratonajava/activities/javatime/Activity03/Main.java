package academy.devdojo.maratonajava.activities.javatime.Activity03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate mothersAniversary = LocalDate.of(1982, Month.MAY, 20);

        String diaSemana = null;
        switch (mothersAniversary.getDayOfWeek().getValue()){
            case (2):
                diaSemana = "Segunda-Feira";
                break;
            case (3):
                diaSemana = "Terça-feira";
                break;
            case (4):
                diaSemana = "Quarta-feira";
                break;
            case (5):
                diaSemana = "Quinta-feira";
                break;
            case (6):
                diaSemana = "Sexta-feira";
                break;
            case (7):
                diaSemana = "Sábado";
                break;
            case (1):
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Data Inválida!!");
                break;
        }
        System.out.println("Dia do mês: " + mothersAniversary.getDayOfMonth());
        System.out.println("Dia da semana: " + diaSemana);
        System.out.println("Mês: " + mothersAniversary.getMonthValue());
        System.out.println("Ano:"+mothersAniversary.getYear());

    }
}
