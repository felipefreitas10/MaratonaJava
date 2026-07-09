package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salarios = new int[3];

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setSalarios(int... salarios){
        this.salarios = salarios;
    }

    public int[] getSalarios(){
        return this.salarios;
    }

    public void impremirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+ this.idade);
        for(int i = 0; i < this.salarios.length; i++){
            System.out.println("Salário " + i + " " + this.salarios[i]);
        }
    }

    public double calcularMediaSal(){
            int soma = 0;
            for(int sal:this.salarios){
                soma += sal;
            }

            return (double)soma/3; //divisão de inteiros resulta em inteiros
    }
}
