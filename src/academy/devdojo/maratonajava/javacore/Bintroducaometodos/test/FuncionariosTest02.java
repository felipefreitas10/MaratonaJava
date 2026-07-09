package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionariosTest02 {
    public static void main(String... args){
        Funcionario func = new Funcionario();
        double media;

        func.setNome("Felipe");
        func.setIdade(20);
        func.setSalarios(1500, 2000, 3000);

        func.impremirDados();
        media = func.calcularMediaSal();

        System.out.println(media);
    }

}
