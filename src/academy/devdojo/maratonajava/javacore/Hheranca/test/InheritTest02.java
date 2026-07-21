package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Employee;
//Sequência de execução com herança

//0 - Bloco de inicialização estático da classe pai é executado quando a JVM carregar a classe pai
//1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a subclasse
//2 - Aloca espaço na memória para o objeto classe pai
//3 - Inicializa os atributos da classe pai com os valores default ou com os valores passados
//4 - Blocos de inicalização não estáticos da da classe pai são executados na ordem em que foram escrito
//5 - Executa o construtor da classe pai
//6 - Aloca espaço na memória para a cubclasse
//7 - Inicializa os atributos da subclasse com os valores default ou com os valores passados
//8 - Blocos de inicialização não estáticos da sub classe são executados na ordem em que foram escritos
//9 - Executa o construtor da classe filha


public class InheritTest02 {
    public static void main(String[] args){
        Employee employee = new Employee("Felipe");
    }
}
