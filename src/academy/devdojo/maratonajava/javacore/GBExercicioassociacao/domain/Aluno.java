package academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    //o aluno pode ou não rer um seminario
    public Aluno(String name, int age){
        this.name = name;
        this.age = age;
    }

    //sobrecarga de construtores
    public Aluno(String name, int age, Seminario seminario){
        this(name, age);
        this.seminario = seminario;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
