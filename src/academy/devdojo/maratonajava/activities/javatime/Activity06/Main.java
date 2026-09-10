package academy.devdojo.maratonajava.activities.javatime.Activity06;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate dataEnvio = LocalDate.of(2026, Month.SEPTEMBER, 19);
        LocalDate dataPrazo = LocalDate.of(2026, Month.SEPTEMBER, 12);

        if(dataEnvio.isAfter(dataPrazo)){ //alternativas -> isBefore() / isEquals()
            System.out.println("Entrega realizada com atraso.");
        }else{
            System.out.println("Entrega dentro do prazo.");
        }



    }
}
