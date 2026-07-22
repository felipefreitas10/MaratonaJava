package academy.devdojo.maratonajava.javacore.Isobreescrita.domain;

public class Anime {
    private String name;
    private int age;

    //The method toString inherited from Object class prints the "memory address" of our object, but with override we can change it
    //To indicate that this method superscript from other class


    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Anime(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
