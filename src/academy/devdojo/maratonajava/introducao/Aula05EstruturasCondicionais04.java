package academy.devdojo.maratonajava.introducao;

/**
 * <b>Bracket 1 (up to €38,883): 35.75% (includes 27.65% insurance, 8.10% tax).
 * Bracket 2 (€38,883 - €78,426): 37.56%.
 * Bracket 3 (over €78,426): 49.50%. </b>
 * */
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salarioAnual = 70000;
        double primeiraFaixa = 35.75/100;
        double segundaFaixa = 37.56/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        if (salarioAnual <= 38883) {
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual > 38883 && salarioAnual <= 78426) {
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O valor do imposto será de " + valorImposto);
    }
}
