package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Player;

public class Test01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafu");

        player3.setName("R9");

        Player[] players = new Player[]{player1, player2, player3};

        for(Player player : players ){
           player.imprime();
        }






    }



}
