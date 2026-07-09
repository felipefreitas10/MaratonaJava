package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadorateste03 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        int variavelTemp = (int) calculadora.dividirDoisNumeros(21, 3); //preciso de uma variável para guardar o retorno do meu método

        System.out.println(variavelTemp);

        double variavelTemp02 = calculadora.dividirDoisNumeros02(20,0);

        System.out.println(variavelTemp02);

        calculadora.imprimirDivisaoDoisNumeros(25, 0);
    }
}
