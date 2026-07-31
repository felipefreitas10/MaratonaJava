package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;


public class ProductTest02 {
    public static void main(String[] args) {
        Product product01 = new Computer("Ryzen 9", 3000);
        Product product02 = new Tomato("American", 8);

        System.out.println(product01.getName());
        System.out.println(product01.getValue());

        System.out.println(product02.getName());
        System.out.println(product02.getValue());


    }
}
