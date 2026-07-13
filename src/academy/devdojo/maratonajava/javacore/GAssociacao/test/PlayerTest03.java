package academy.devdojo.maratonajava.javacore.GAssociacao.test;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args){
        Player player01 = new Player("Pelé");
        Player player02 = new Player("Cafu");
        Team team = new Team("Brasil", player01, player02);

        player01.setTeam(team);
        player02.setTeam(team);

        System.out.println("---- JOGADOR ----");
        player01.imprime();

        System.out.println("---- TIME ----");
        team.imprime();

    }
}
