package academy.devdojo.maratonajava.introducao;
/**
 * <b>Switch</b>
 * */
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args){
        //switch é uma opção ao if else
        //é muito utilizado em problemas simples ou substituindo grandes blocos de if else
        //só é valido para os seguintes tipos de dados:
        //byte, int, char, enum, String

        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break; // claúsula utilizada para encerrar o bloco ao entrar no case (evita a entrada em outros cases)
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default: //se não tiver entrado em nenhum case
                System.out.println("Opção inválida");
                break;

        }
    }
}
