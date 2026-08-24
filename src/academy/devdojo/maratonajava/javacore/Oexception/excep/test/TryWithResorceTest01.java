package academy.devdojo.maratonajava.javacore.Oexception.excep.test;

import academy.devdojo.maratonajava.javacore.Oexception.excep.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.excep.domain.Leitor2;

import java.io.*;

public class TryWithResorceTest01 {
    public static void main(String[] args){
        lerArquivo3();
    }

    public static void lerArquivo(){
        Reader reader = null; //declaramos null, pois o bloco finally deve saber que essa variável existe
        try{
            reader = new BufferedReader(new FileReader("teste.txt")); //porém precisamos fechar o arquivo mesmo se houver uma exceção

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{ //fizemos um try/catch só pra fechar o arquivo
                if(reader != null){
                    reader.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    //para evitarmos de ter sintaxes "feias" como essa o java criou o try resource que possibilita fazer tudo isso com apenas um try

    public static void lerArquivo2(){
        //O próprio Java irá fechar o arquivo, mesmo se houver exceções
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){  //Só podemos isso se essa objeto implementar a interface Closeable ou AutoCloseable

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //podemos ter objetos que implemenatam as interfaces Closeable ou AutoCloseable
    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){ //são fechados na ordem inversa da que forem declarados

        }catch (Exception e){

        }
    }
}
