package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao03 {
    public static void main(String[] args){
        //break (encerra um loop ou um switch)
        //imprima os número de uma base até achar o número 25

        for (int i = 0; i <= 50; i++){
            if (i == 25){
                break;
            }
            System.out.println(i);
        }

    }
}
