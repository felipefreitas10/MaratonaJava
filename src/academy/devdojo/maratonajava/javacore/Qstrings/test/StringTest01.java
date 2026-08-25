package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; //String constant Pool

        //O java não cria um novo objeto Willian, ele apenas faz a nova variável de referência apntar para o "Willian" já criado
        String nome2 = "Willian"; //essa variável de referência nome2 faz referência para o mesmo objeto que a variável nome2

        System.out.println(nome == nome2);

        nome = nome.concat(" Suane"); //Não estamos mudando valor da String, mas criando uma nova e atualizando a referência
        System.out.println(nome);

        //Podemos criar uma string da maneira que criamos um objeto, porém a variável de referência não vai fazer referência para uma String direta no pool de strings, mas o conteúdo do objeto sim

        String nome3 = new String("Willian"); //1- variável de referência ; 2 - objeto String ; 3 - um string no pool de string

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        System.out.println(nome2.equals(nome3));

    }


}
