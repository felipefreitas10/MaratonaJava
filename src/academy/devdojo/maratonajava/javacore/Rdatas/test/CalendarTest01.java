package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args){
        //classe abstrata, logo não podemos instanciar diretamente

        Calendar c = Calendar.getInstance(); //pega o agora
        System.out.println(c); //apresenta muito mais informações do que o Date

        //"transformando" tudo isso em uma data simples
        Date date = c.getTime();

        System.out.println(date);

//        //A classe calendar apresenta vários métodos e classes abstratas que podem nos auxiliar
//        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
//            System.out.println("O primeiro dia da semana é domingo");
//        }

        //constantes da classe Calender
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //podemos também adicionar na nossa data
        c.add(Calendar.DAY_OF_MONTH, 2);


        System.out.println(c.getTime());

        c.add(Calendar.HOUR, 12); //se passar da hora do dia, ele passa para o outro

        System.out.println(c.getTime());

        c.roll(Calendar.HOUR, 12);

        System.out.println(c.getTime());



    }
}
