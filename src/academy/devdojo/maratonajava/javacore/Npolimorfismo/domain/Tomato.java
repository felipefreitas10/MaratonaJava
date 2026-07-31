package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double TAX_PER_CENT = 0.06;
    private String data_validade;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxe(){
        return this.value * TAX_PER_CENT;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }
}
