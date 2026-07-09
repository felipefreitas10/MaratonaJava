package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao01 {
    public static void main(String[] args){
        //while
        int count = 0;
        while(count<10){
            System.out.println("While" + count);
            count++;
        }

        //Pode-se ser utilizado em só uma linha, caso tenha apenas um comando
        count = 1;
        while (count <= 10) System.out.println(count++);

        //do while -> faça ... enquando (repete pelo menos uma vez)
        count = 0;
        do {
            System.out.println("Dentro do while... "+ ++count);
        }while (count < 10);

        //for

        for(int i = 1; i <= 10; i++){
            System.out.println("dentro do for_1... " + i);
        }

        for (count = 0; count < 11; count+=2){ //não precisa criar a variável nesse caso apenas dar um valor pra ela
            System.out.println("dentro do for_2... " + count);
        }
    }
}
