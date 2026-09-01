package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args){
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeNetherlands = new Locale("nl", "NL");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); //df armazena a data na formatação da itália no formato full
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        Calendar calendar = Calendar.getInstance();

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));

        //Também temos opções para descobrir a localidade de um objeto locale
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry(localeItaly)); //agora retorna Itália em italiano

        //para descobrir o local de onde estamos
        System.out.println(Locale.getDefault());
    }
}
