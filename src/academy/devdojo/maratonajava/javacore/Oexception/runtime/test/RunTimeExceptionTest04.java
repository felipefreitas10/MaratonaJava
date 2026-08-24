package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class RunTimeExceptionTest04 {
    public static void main(String[] args){
        //podemos capturar múltiplas exceções
        try{
            throw new ArithmeticException();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro IndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Dentro IndexOutOfBoundsException");
        }catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RunTimeException");
        }

        //Observação: sempre devemos ter a captura da exceção mais especializada para a mais genérica, já que pela regra do polimorfismo o catch genérico pode capturar as exceções específicas


        //Se tivermos múltiplas exceções que não estão na mesma linha de herança podemos usar a seguinte sintaxe
        try{
            capturando();
        }catch (SQLException | FileNotFoundException e){
            System.out.println("Ou FileNotFound ou SQLException");
        }
    }

    public static void capturando() throws SQLException, FileNotFoundException{ //Esse metodo pode lançar umas das exceções



    }
}
