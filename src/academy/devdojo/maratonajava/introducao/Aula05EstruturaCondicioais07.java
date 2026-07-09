package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicioais07 {
    public static void main(String[] args){
        //simplificação do último exercício
        //no swicth do Java caso ele entre em uma condição ele vai entrar nas outras se não encontrar um break
        //vamos utilizar isso para simplificar o problema
        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Entrada inválida!");
                break;
        }
    }

}
