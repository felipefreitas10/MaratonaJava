package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxableCalculater;

public class ProductTest01 {
    public static void main(String[] args){
        Computer computer = new Computer("Acer Nitro v15", 5000);
        Tomato tomato = new Tomato("Siciliana", 10);
        Television tv = new Television("Samsung 50 \" ", 5000);

        TaxableCalculater.calculatingTaxe(computer);
        System.out.println("------------------------------------------");
        TaxableCalculater.calculatingTaxe(tomato);
        System.out.println("------------------------------------------");
        TaxableCalculater.calculatingTaxe(tv);


    }
}
