package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest01 {
    public static void main(String[] args){
        Calculadora calcu = new Calculadora();
        calcu.somarDoisNumeros();
        calcu.subtrairDoisNumeros();

        System.out.println("Finalizando com calculadoraTest01");

    }

}
