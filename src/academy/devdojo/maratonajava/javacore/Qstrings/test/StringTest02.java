package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "0123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "c"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 3)); //O primeiro índice é inclusivo, já o segundo não é
        System.out.println(numeros.substring(2)); //do caractere da posição 2 até o final

    }
}
