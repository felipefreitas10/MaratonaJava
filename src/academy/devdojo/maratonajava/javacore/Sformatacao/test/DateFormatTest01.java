package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

//        DateFormat[] df = new DateFormat[7];
//
//        df[0] = DateFormat.getDateInstance();

        DateFormat df = DateFormat.getInstance(); //Não instancia diretamente

        System.out.println(df.format(calendar.getTime()));

        df = DateFormat.getDateTimeInstance();

        System.out.println(df.format(calendar.getTime()));

        df = DateFormat.getDateInstance(DateFormat.SHORT);

        System.out.println(df.format(calendar.getTime()));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);

        System.out.println(df.format(calendar.getTime()));

        df = DateFormat.getDateInstance(DateFormat.LONG);

        System.out.println(df.format(calendar.getTime()));

        df = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println(df.format(calendar.getTime()));

    }
}
