package academy.devdojo.maratonajava.activities.javatime.activity02;

import java.time.LocalDate;

public class Activity02 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();

        //Antes da manipulação
        System.out.println(today);

        today = today.plusDays(15).plusMonths(3).plusYears(2); //imutável, logo devemos atualizar a variável de referência

        //depois da manipulação
        System.out.println(today);
    }
}
