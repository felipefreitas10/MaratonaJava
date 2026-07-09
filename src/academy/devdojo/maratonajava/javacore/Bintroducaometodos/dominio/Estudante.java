package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //não é uma boa prática colocar isso neste arquivo de domínio
    //pois a classe estudante já é responsável por mapear o mundo  e moldar no sistema
    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome); //this se refere a algo deste objeto em específico
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
