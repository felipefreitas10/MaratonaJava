package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args){ //um estatico, ou seja, uma caracteristica da classe, que não retorna nada, seu nome é main, e recebe como parametro um array do tipo string
        Anime anime = new Anime("One Piece");
        Anime anime2 = new Anime();

        System.out.println();
        for (int episodio : anime2.getEpisodios()) {
            System.out.print(episodio + " ");
        }

        System.out.println();

        System.out.println(anime.getEpisodios()); //como chamamos outro construtor o nosso atributo episódios não será inicializado
        System.out.println(anime2.getEpisodios()); //como chamamos outro construtor o nosso atributo episódios não será inicializado





    }
}
