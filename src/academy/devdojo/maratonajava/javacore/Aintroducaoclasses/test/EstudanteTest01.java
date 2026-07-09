package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante est = new Estudante();

        est.nome = "Felipe";
        est.idade = 20;
        est.sexo = 'M';

        System.out.println(est.nome);
        System.out.println(est.idade);
        System.out.println(est.sexo);

        System.out.println(est); //vai nos fornecer o endereço de memória objeto, este endereço fica armazenado na variável de referência, neste caso a est



    }
}
