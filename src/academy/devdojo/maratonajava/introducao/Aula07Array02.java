package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        /*Dados iniciais de um array dependendo do tipo
         *int, short, long, enum, double, float -> 0
         * char -> ' '
         * boolean -> false
         * variáveis de referência (String) -> null
         * */

        char[] letras = new char[3];
        float[] num = new float[3];
        boolean[] truorfalse = new boolean[3];
        String[] nomes = new String[3];

        System.out.println(letras[0]);
        System.out.println(letras[1]);
        System.out.println(letras[2]);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(truorfalse[0]);
        System.out.println(truorfalse[1]);
        System.out.println(truorfalse[2]);
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

    }
}
