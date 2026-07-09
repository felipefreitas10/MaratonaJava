package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora obj = new Calculadora();

        int[] numeros = new int[]{1, 2, 3, 4};

        int[] numeros03 = new int[3];

        numeros03[0] = 1;
        numeros03[1] = 10;
        numeros03[2] = 20;

        obj.somaArray(numeros);
        //obj.somaArray(1,2,4,5,6); vai dar erro porque o compilador não vai entender como um array

        obj.somaArray(numeros03);

        obj.somaVarArgs(1,2,3,4,5,6,7,8,9,10);

    }

}
