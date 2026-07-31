package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product{
    public static final double TAX_PER_CENT = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxe(){
        return this.value * TAX_PER_CENT;
    }
}
