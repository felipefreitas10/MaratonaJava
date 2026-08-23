package academy.devdojo.maratonajava.javacore.Oexception.excep.test;


import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args){
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\arquivo.txt"); //esse metodo pode lançar uma unchecked exception, logo devemos tratar

        try {
            boolean isCreated = file.createNewFile(); //todas as vezes que tivermos trabalhando com o classes filhas diretamente de Exception devemos ter código neste bloco
            System.out.println("Arquivo criado " +  isCreated);
        }catch (IOException e){ //e vai ser um objeto da classe da exceção que é lançada. Devemos colocar a exceção específica para podermos tratá-la da melhor maneira.
            e.printStackTrace();
        }
    }
}
