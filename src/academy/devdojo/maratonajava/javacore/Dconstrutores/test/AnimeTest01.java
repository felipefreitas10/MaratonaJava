package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime("Dragon Ball", "TV", 1567, "Ação", "Marvel");
        Anime anime2 = new Anime(); //o segundo construor permite que este objeto seja criado sem nenhum valor


        anime.imprime();

    }
}
