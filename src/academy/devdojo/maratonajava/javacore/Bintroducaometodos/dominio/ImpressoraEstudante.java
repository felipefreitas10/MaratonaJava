package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimirEstudante(Estudante estudante){
        //a variável estudante dentro deste escopo vai fazer referencia ao mesmo objeto que a variavel passada como argumento faz
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
