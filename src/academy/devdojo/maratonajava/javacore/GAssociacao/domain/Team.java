package academy.devdojo.maratonajava.javacore.GAssociacao.domain;

public class Team {
    //Um time pode ter vários jogadores
    public String name;
    public Player[] players;


    public Team(String name) {
        this.name = name;
    }

    //sobrecarga com varargs
    public Team(String name, Player... players){
        this(name);
        this.players = players;
    }

    public void imprime(){
        System.out.println(this.name);
        if(this.players == null) return;

        for(Player player : players){
            System.out.println(player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayesr() {
        return players;
    }

    public void setPlayes(Player[] players) {
        this.players = players;
    }
}
