package academy.devdojo.maratonajava.desafios.Challenge06.Trainings.Dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AjusteFinoDatas {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();

        LocalDate lastDayOfMonth = ld.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("O último dia do mês corrente será: " + lastDayOfMonth);

        LocalDate nextFridayNextMonth = ld.with(TemporalAdjusters.firstDayOfNextMonth());

        if(nextFridayNextMonth.getDayOfWeek() != DayOfWeek.FRIDAY) {
            for (int i = 0; i < 7; i++) {
                nextFridayNextMonth = nextFridayNextMonth.plusDays(1);
                if(ld.getDayOfWeek() == DayOfWeek.FRIDAY){
                    break;
                }
            }
        }

        System.out.println("Próxima sexta-feira do próximo mês: " + nextFridayNextMonth);

    }
}
