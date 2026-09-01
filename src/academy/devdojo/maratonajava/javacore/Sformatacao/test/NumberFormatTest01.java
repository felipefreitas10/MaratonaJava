package academy.devdojo.maratonajava.javacore.Sformatacao.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locale1 = new Locale("it", "CH");
        Locale locale2 = Locale.ITALY;
        Locale locale3 = Locale.JAPAN;

        NumberFormat[] nb = new NumberFormat[4];

        nb[0] = NumberFormat.getInstance(); //já vai com o local default
        nb[1] = NumberFormat.getInstance(locale1); //Suiça
        nb[2] = NumberFormat.getInstance(locale2);
        nb[3] = NumberFormat.getInstance(locale3);

        double valor = 1000000000;

        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.format(valor));
        }

        //Um NumberFormat consegue transformar um texto em um número e formatar

        String numero = "100000.00"; //O parse só captura caracteres válidos na transformação, logo ele só vai capturar 1

        try {
            System.out.println(nb[0].parse(numero));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
