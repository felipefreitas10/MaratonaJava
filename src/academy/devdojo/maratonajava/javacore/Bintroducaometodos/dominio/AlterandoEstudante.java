package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class AlterandoEstudante {
    //não é uma boa prática alterar um objeto deste jeito!!
    public void alterarEstudante(Estudante estudante, String nome, int idade, char sexo){
        estudante.nome = nome;
        estudante.idade = idade;
        estudante.sexo = sexo;
    }
}
