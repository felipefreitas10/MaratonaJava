package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import  academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import  academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxableCalculater {
    public static void calculatingTaxe(Product product){
        System.out.println("Report");
        System.out.println("Name: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Taxe Value: "+ product.calculateTaxe());
        if(product instanceof Tomato){ //If that variable make reference to a Tomato Object
            Tomato tomato = (Tomato) product; //We transform that Product variable in Tomato variable and qe passed on your value (reference) tomato variable
            System.out.println(tomato.getData_validade());
        }
    }

    //We don't need these methods 'cause we have a generic method that receives whatever objects from class that extended the superclass

    //    public static void calculateTaxeComputer(Computer computer){
//        System.out.println("Report");
//        System.out.println("Computer " + computer.getName());
//        System.out.println("Value " + computer.getValue());
//        System.out.println("Taxe Value " + computer.calculateTaxe());
//    }
//
//    public static void calculateTaxeTomato(Tomato tomato){
//        System.out.println("Report");
//        System.out.println("Tomato " + tomato.getName());
//        System.out.println("Value " + tomato.getValue());
//        System.out.println("Taxe Value " + tomato.calculateTaxe());
//}
}
