package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "Lucivaldo";
        prof.idade = 37;
        prof.sexo = 'M';

        System.out.println(prof.nome + " " + prof.idade + " " + prof.sexo);
    }
}
