package academy.devdojo.maratonajava.javacore.GBExercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain.Seminario;

public class Test01 {
    public static void main(String[] args){
        Local local1 = new Local("Escola Gonçalves Dias - Auditório");
        Local local2 = new Local("UEMA CCT - Auditório");
        Seminario seminario1 = new Seminario("Buscando Conhecimento", local1);
        Aluno aluno1 = new Aluno("Antônio", 21);
        Aluno aluno2 = new Aluno("Erick", 20);
        Aluno aluno3 = new Aluno("Emerson", 20);
        Aluno aluno4 = new Aluno("Gabi", 18);
        Aluno aluno5 = new Aluno("Victor", 12);
        Aluno aluno6 = new Aluno("José", 14);



        Seminario seminario2 = new Seminario("Como Programar", local2);

        seminario1.setAlunos(aluno5, aluno6);



        Professor professor1 = new Professor("Lucivaldo", "Manutenção de Computadores", seminario1, seminario2);

        seminario2.setAlunos(aluno1, aluno2, aluno3, aluno4);

        seminario2.imprimirSeminario();

        professor1.imprimindoProfessor();





    }
}
