package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    Buyer buyer01 = new Buyer();

    private String name;
    public static final double FINAL_VELOCITY; //The modifier 'final' define a const, they generally are public because they will be accessed in another class
    public final Buyer BUYER = buyer01; //We are saying that this reference never can change, but we can change or access its attributes.

    static{
        FINAL_VELOCITY=250;
    }

    public final void toPrint(){ //The modifier 'final' difine that this method can't be superscript

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
