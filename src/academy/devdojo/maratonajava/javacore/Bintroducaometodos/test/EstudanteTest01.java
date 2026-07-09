package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.AlterandoEstudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        AlterandoEstudante alterandoEstudante = new AlterandoEstudante();

        estudante01.nome = "Antonio";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        impressoraEstudante.imprimirEstudante(estudante01); //estamos passando na verdade a referencia de onde o objeto está

        impressoraEstudante.imprimirEstudante(estudante02); //estamos passando na verdade a referencia de onde o objteo está

        //Como passamos o argumento será a referência do nosso objeto a variavel local do escopo do metodo tera acessoa ao objeto original e podera alter-la

        alterandoEstudante.alterarEstudante(estudante01, "Victor", 12, 'M');

        impressoraEstudante.imprimirEstudante(estudante01);






    }

}
