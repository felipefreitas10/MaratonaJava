package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudandeTest02 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Antonio";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
