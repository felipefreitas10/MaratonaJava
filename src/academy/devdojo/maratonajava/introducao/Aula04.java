package academy.devdojo.maratonajava.introducao;

import java.security.spec.RSAOtherPrimeInfo;

public class Aula04 {
    public static void main(String[] args){
        //Operadores
        int num1 = 20;
        int num2 = 10;

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / (double) num2; //qualquer operação entre inteiros resulta em um inteiro, por isso o casting

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        //operador de resto
        int resto = 20 % 10;
        System.out.println("O resto da divisão de 20 por 10 é: " + resto);

        //operadores relacionais (retorna true or false1)
        //< > <= >= == !=

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println(isDezMaiorVinte);
        System.out.println(isDezMenorVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);

        //operadores lógicos
        //&& (AND) || (OR) !(NOT)

        float salario = 3500f;
        int age = 35;

        boolean isDentroDaLeiMairTrinta = age > 30 && salario > 3000;
        boolean isDentroDaLeiMenorTrinta = age < 30 && salario > 3500;

        System.out.println(isDentroDaLeiMairTrinta);
        System.out.println(isDentroDaLeiMenorTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 10000;

        float playstationValor = 5000f;

        boolean isPlaystationCompravel = contaCorrente > playstationValor || contaPoupanca > playstationValor;

        System.out.println("IsPlaystationCompravel "+isPlaystationCompravel);

        // Operadores de atribuição
        // =, +=, -=, *=, /=, =%

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);

        // incremento e decremento
        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2--);








    }


}
