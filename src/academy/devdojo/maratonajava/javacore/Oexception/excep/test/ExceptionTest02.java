package academy.devdojo.maratonajava.javacore.Oexception.excep.test;


import java.io.File;
import java.io.IOException;


public class ExceptionTest02 {
    public static void main(String[] args) {
        try{
            criarNovoArquivo();
        }catch(IOException e){
            System.out.println("Exceção IOException capturada");
        }

        System.out.println("Bloco main finalizado");
    }


    //podemos ter metodos que irão tratar as exceções e também irão lançá-las
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\arquivo.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " +  isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw e; //Não utilizamos a cláussula new porque não estamos criando uma nova exceção e sim enviando
        }
    }
}
