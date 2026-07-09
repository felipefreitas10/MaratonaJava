package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao04 {
    public static void main(String[] args){
        //imprima em quantas vezes se pode parcelar um carro
        //a menor parcela tem que ser de no mínimo 1000

        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if (valorParcela >= 1000) {
                System.out.println(parcela + " vezes de: " + valorParcela);
            }else {
                break;
            }
            System.out.println("Dentro do for, fora do if");
        }

        //outra versão da resolução do mesmo problema
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(parcela + " vezes de: " + valorParcela);
        }
    }
}
