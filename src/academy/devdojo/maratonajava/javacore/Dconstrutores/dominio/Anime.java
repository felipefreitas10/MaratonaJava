package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Contrutor -> é o que dá origem a um objeto

    public Anime(){ //ou seja um objeto da classe anime também pode ser criado sem nenhum valor para os atributos

    }
    //também podemos usar a sobrecarga para construtores


    public Anime(String nome, String tipo, int episodios, String genero){ //definimos que um objeto deve ser criado com nome, tipo, episodios e genero
        System.out.println("Dentro do contrutor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //O jeito correto de se usar a sobrecarga de métodos é usando o this (ele já faz referência ao construtor)
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero); //faz referência ao primeiro construtor
        this.estudio = estudio;
    }

    //para os metodos
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }


    //para os getters e setters

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
