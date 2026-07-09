package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Celta";
        carro01.modelo = "ret";
        carro01.ano = 2010;


        carro02.nome = "Classic";
        carro02.modelo = "sedan";
        carro02.ano = 2005;

        System.out.println("Carro: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano :" + carro01.ano);

        System.out.println("Carro: " + carro02.nome + " Modelo: " + carro02.modelo + " Ano :" + carro02.ano);

        //dessa maneira a variável de refência passa a apontar pro messmo espaço de memória que a variável de referência carro2 aponta
        carro01 = carro02; //iremos perder o antigo espaço de memória que carro01 referênciava

        //só funciona com variáveis de referência que apontam para objetos de mesma classe


        System.out.println("Carro: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano :" + carro01.ano);


    }
}
