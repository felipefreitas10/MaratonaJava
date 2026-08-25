package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        //StringBuilder não são imutáveis

        String nome = "Willian";
        nome.concat(" Suane");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian");
        sb.append(" Suane").append(" DevDojo"); //cuidado com os excessos de append
        System.out.println(sb);

        //StringBuilder também oferece alguns métodos úteis
        sb.reverse(); //alteramos o valor da StringBuilder
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String substring = sb.substring(0,5); //se o metodo retornar uma string então ele não vai alterar o valor da nossa StringBuilder
        System.out.println(sb);
        System.out.println(substring);

        sb.delete(0,3);
        System.out.println(sb);
    }
}
