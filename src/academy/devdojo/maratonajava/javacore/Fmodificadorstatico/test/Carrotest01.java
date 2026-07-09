package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatico.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args){
        Carro.velocidadePermitida = 300; //consigo acessar o atributo sem ter um objeto -> pois o atributo é static
        Carro.setVelocidadePermitida(250);  //consigo acessar o atributo sem ter um objeto -> pois o metodo é static

        Carro carro1 = new Carro("Mercedes", 285);
        Carro carro2 = new Carro("BMW", 300);
        Carro carro3 = new Carro("Audi", 290);

        //só irei alterar a velocidade de uma das instâncias

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        Carro.velocidadePermitida = 245; //estamos mudando a caracteristica da classe em si e não de um objeto

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


        System.out.println("\n"+ Carro.getVelocidadePermitida());



    }
}
