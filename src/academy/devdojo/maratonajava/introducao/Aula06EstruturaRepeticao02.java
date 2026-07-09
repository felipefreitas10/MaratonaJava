package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao02 {
    public static void main(String[] args){
        //imprima todos os números pares de 0 a 1000000
        for (int i = 0; i <= 100000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

//Sempre pense no que pode acontecer no futuro, escabilidade e futuras regras de negócio