package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product{
    public static final double TAX_PER_CENT = 0.21;
    public Television(String name, double value){
        super(name, value);
    }
    @Override
    public double calculateTaxe(){
        return this.value * TAX_PER_CENT;
    }
}
