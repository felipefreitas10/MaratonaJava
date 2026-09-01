package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {
        //Uma maneira mais simples de se trabalhar com data
        String pattern = "'Amsterdan' dd 'de' MMMM 'de' yyyy"; //O formato que queremos, ignora o que está entre aspas simples

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdan 27 de agosto de 2026")); //consegue retornar porque passamos no mesmo padrão
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
