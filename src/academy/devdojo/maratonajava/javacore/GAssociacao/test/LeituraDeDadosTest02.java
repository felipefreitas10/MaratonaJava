package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import java.util.Scanner;

public class LeituraDeDadosTest02 {
    public static void main(String[] args){
        System.out.println("O Grande Software de Previsão do Futuro");
        System.out.println("Faça sua pergunta: ");
        Scanner input = new Scanner(System.in);

        String pergunta = input.nextLine();
        int a = 10;

        System.out.println("Resposta: ");
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }

}
