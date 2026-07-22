package academy.devdojo.maratonajava.javacore.Isobreescrita.test;

import academy.devdojo.maratonajava.javacore.Isobreescrita.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball", 70);

        System.out.println(anime); //It will print a memory address

        //To print the anime's name, we must build a method to print
        //But with override we can only override a method from Class Object (all java class inherit characterist from Object class)
    }
}
