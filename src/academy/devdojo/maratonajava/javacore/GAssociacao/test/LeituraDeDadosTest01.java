package academy.devdojo.maratonajava.javacore.GAssociacao.test;


import java.util.Scanner;

public class LeituraDeDadosTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine(); //Para strings
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = entrada.next().charAt(0); //Como uma string é um array de char, vamos pegar apenas a primeira posição

        System.out.println("-------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


        //next() --> pega só a primeira palavra da String

    }

}
