package academy.devdojo.maratonajava.javacore.GAssociacao.test;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Team;

public class Test02 {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Team team01 = new Team("Seleção Brasileira");

        player01.setTeam(team01);

        player01.imprime();

    }




}
