package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();

//        anime.setTipo("TV");
//        anime.setEpisodios(12);
//        anime.setNome("Dragon Ball");

        anime.init("Dragon Ball", "TV", 1567);

        anime.imprime();

    }
}
