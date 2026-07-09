package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.dominio;

public class Anime {
    public String nome;
    public static int[] episodios;

    //bloco de inicialização estático - só executa uma vez
    //vez antes da alocação de memória para o objeto, por isso ele só trabalha com atributos de classe, ou seja, estáticos
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        Anime.episodios = new int[100];

        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i+1;
        }
    }

    static{
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static{
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome){
        this.nome = nome;
        System.out.println("Dentro de um construtor");
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public Anime(){
        System.out.println("Dentro do Construtor");
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


}
