package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        //Nova e mais recomendada forma de se trabalhar com datas -> LocalDate
        LocalDate date = LocalDate.of(2024, Month.JULY, 21);
        System.out.println(date);
        LocalDate date2 = LocalDate.now();
        System.out.println(date2);

        //É uma classe imutável logo, não alteramos o valor de um LocalDate e sim criamos uma nova
        date2.plusWeeks(5);
        System.out.println(date2);

        //Porém podemos alterar a referência da variável
        date2 = date2.plusWeeks(5);
        System.out.println(date2);

        //Metodos úteis
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); //tamanho do mês
        System.out.println(date.isLeapYear()); //se o ano é bisexto
    }
}
