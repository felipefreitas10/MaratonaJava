package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCoutries = Locale.getISOCountries(); //Todos os paises que o meu sistema suporta
        String[] isoLanguages = Locale.getISOLanguages(); //Todas os idiomas que o meu sistema suporta

        for (String isoCoutry : isoCoutries) {
            System.out.print(isoCoutry + " ");
        }

        System.out.println();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }




    }
}
