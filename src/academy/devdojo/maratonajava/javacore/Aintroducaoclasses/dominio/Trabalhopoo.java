package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

import java.util.ArrayList;
import java.util.List;

public class Trabalhopoo {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();

        alunos.add("Felipe");
        alunos.add("Ana");
        alunos.add("Carlos");

        alunos.remove(1);

        System.out.println(alunos.get(0));
    }
}

