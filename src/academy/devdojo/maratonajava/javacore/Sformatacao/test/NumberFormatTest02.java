package academy.devdojo.maratonajava.javacore.Sformatacao.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale locale1 = new Locale("it", "CH");
        Locale locale2 = Locale.ITALY;
        Locale locale3 = Locale.JAPAN;

        NumberFormat[] nb = new NumberFormat[4];

        nb[0] = NumberFormat.getCurrencyInstance(); //já vai com o local default
        nb[1] = NumberFormat.getCurrencyInstance(locale1); //Suiça
        nb[2] = NumberFormat.getCurrencyInstance(locale2);
        nb[3] = NumberFormat.getCurrencyInstance(locale3);

        double valor = 1000.2310;

        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.format(valor));
        }


        String numero = "￥100000.00"; //como estamos trabalhando com moedas o parse precisa saber a cifra da moeda
        //se for uma moeda diferente da esperada, o parse lança uma exceção

        try {
            System.out.println(nb[3].parse(numero));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
