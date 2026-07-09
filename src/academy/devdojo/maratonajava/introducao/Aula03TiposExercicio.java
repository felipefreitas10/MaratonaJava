package academy.devdojo.maratonajava.introducao;

/*
* Crie as variáveis para os campos abaixo entre <> e imprima as seguintes mensagem:
*
* eu <nome>, morando no <endereco>
confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula03TiposExercicio {
    public static void main(String[] args) {
        String nome = "Antônio Felipe";
        String end = "Est. da Vitória, Maracanã, num. 15";
        double sal = 2500;
        String dataRecebimentoSal = "18/03/2026";
        String relatorio = "Eu " + nome + ", morando no " + end + "confirmo que recebi o salário de " + sal + ", na data " + dataRecebimentoSal;

        System.out.println(relatorio);
    }
}
