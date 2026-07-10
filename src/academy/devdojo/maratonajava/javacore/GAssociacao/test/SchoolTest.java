package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.domain.School;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Luís Carlos");
        Teacher teacher2 = new Teacher("Milton");
        Teacher teacher3 = new Teacher("Brandão");

        School school1 = new School("Gonçalves Dias");
        School school2 = new School("UEMA", teacher1, teacher2, teacher3);

        school1.imprime();
        school2.imprime();

    }
}
