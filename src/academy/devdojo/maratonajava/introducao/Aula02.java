package academy.devdojo.maratonajava.introducao;

public class Aula02 {
    public static void main(String[] args){
        /*Tipos primitivos em Java:
        * int, double, float, char, boolean, long, short, byte
        * */

        //declarando uma variável em Java
        int age = (int) 1000000000000L;  //casting
        double salarioDouble = 2000.50;
        float salarioFloat = 2500.50f; //ao colocar o f no final eu especifiquei que era um float
        boolean falso = false;
        boolean verdadeiro = true;
        long numeroGrande = (long) 1000000000.67;
        short numeroPequeno = 10;
        char caractere = 67; //imprime o valor da tabela ASCII

        //string é uma classe
        String nome = "Antônio Felipe";

        System.out.println(age);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(falso);
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println(numeroPequeno);
        System.out.println(caractere);

        //casting -> é quando força amos um número de um tipo primitivo caber em uma variável de outro tipo primitivo

        System.out.println("Meu nome é " + nome);

    }
}
