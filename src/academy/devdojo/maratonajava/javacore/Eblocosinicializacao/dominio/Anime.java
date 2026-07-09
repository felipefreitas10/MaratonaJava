package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    public String nome;
    public int[] episodios; //essa inicialização acontece antes mesmo da execução do construtor

    //bloco de inicialização
    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodios = new int[100];

        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i+1;
        }
    }

    //Construtor ->  um metodo especial, chamado automaticamente no momento da criação (instanciação) de um objeto desta classe
    public Anime(String nome){
        this.nome = nome;
        System.out.println("Dentro de um construtor");
    }

    public Anime(){
        System.out.println("Dentro do Construtor");
        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEpisodios(int[] episodios){
        this.episodios = episodios;
    }

    public int[] getEpisodios(){ //retorna um vetor do tipo inteiro
        return this.episodios;
    }

}
