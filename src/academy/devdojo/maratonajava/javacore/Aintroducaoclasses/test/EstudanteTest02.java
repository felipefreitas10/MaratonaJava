package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main (String[] args){
        //é possível apenas criar um objeto
        new Estudante(); //porém não iremos consegir acessá-lo

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        //será retornado os valores zero de cada atributo
        System.out.println(estudante01.nome); //como este atributo foi inicializado na classe irá aperecer o valor dela
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        estudante02.nome = "Cristiano Ronaldo";

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);






    }
}
