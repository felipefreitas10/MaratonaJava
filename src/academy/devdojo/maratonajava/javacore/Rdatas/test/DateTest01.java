package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //trabalha com um long que representa o tempo em milisegundos
        Date date = new Date(); //quando não passamos nada no construtor significa que estamos lidando com o agora
        System.out.println(date.getTime());

        Date date2 = new Date(1007754334194L);
        System.out.println(date2); //o toString converte o long de milisegundos para uma data

    }
}
