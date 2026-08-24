package academy.devdojo.maratonajava.javacore.Oexception.excep.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, ArithmeticException { //ArithmetiicException é uma RunTimeExcpetion então podemos colocá-la
        System.out.println("Salvando");
    }
}
