package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest04 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alterandoDoisNumeros(a, b);

        System.out.println("Dentro do Calculadoratest04");
        System.out.println(a);
        System.out.println(b);
    }
}
