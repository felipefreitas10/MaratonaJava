package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturarRepeticao05 {
    public static void main(String[] args){
        double valorCarro = 30000;
        for (int parcela = 1; parcela < valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if (valorParcela < 1000){
                continue; //passa para a próxima iteração imediatamente
            }

            System.out.println(parcela + " vezes de: " + valorParcela);
        }
    }
}
