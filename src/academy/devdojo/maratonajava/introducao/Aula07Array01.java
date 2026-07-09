package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args){
        //Arrays -> são objetos
        //A variável é uma variável do tipo referencia
        //São inicializados com um valor padrão, diferentemente do C
        int[] numeros = new int[3];

        System.out.println(numeros); //como numeros é uma referência de memória o que será impresso é um endereço
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        int[] idade = new int[3];
        idade[0] = 12;
        idade[1] = 15;
        idade[2] = 21;

        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
    }
}
