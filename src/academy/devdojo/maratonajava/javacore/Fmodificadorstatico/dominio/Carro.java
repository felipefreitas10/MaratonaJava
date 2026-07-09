package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadePermitida = 250; //ou seja, essa velocidadePermitida é uma caracteristica da classe carro e não do objeto em si

    //Para o construtor
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(Carro.velocidadePermitida);
    }


    //Para os getters e os setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    //métodos estáticos
    public static void setVelocidadePermitida(double velocidadePermitida){
        Carro.velocidadePermitida  = velocidadePermitida;
    }

    public static double getVelocidadePermitida(){
        return velocidadePermitida;
    }

}
