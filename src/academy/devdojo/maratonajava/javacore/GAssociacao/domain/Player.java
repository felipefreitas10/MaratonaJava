package academy.devdojo.maratonajava.javacore.GAssociacao.domain;

public class Player {
    //Associação unidirecional N:1 (Vários jogadores possui um time)
    public String name;
    public Team team;

    //ele não necessiariamente precisa ter um time
    //como é um relacionamento unidirecional, só na classe player que temos o atributo que é o objeto da outra classe (no caso, Team)
    //o time não tem conhecimento do jogador
    public Player(String name) {
        this.name = name;
    }

    public void imprime(){
        System.out.println(this.name);
        if (this.team != null){
            System.out.println(this.team.getName());
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
